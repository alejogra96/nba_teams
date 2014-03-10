package com.agr.dao.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.agr.entity.player.Player;


@Repository
public class PlayerDaoImpl implements PlayerDao {

	@Autowired
	private MongoOperations mongoOperations;
	
	@Override
	public void savePlayer(Player player) {
		mongoOperations.save(player);
		
	}

	@Override
	public List<Player> getPlayers(String teamId) {
		Query query = new Query(Criteria.where("teamId").is(teamId));
		return mongoOperations.find(query, Player.class);
	}

	@Override
	public Player getPlayer(String playerId) {
		return mongoOperations.findById(playerId, Player.class);
	}
	
}

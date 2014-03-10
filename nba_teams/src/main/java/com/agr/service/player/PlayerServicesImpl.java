package com.agr.service.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agr.dao.player.PlayerDao;
import com.agr.entity.player.Player;

@Service
public class PlayerServicesImpl implements PlayerServices {

	@Autowired
	private PlayerDao playerDao;
	
	@Override
	public void savePlayer(Player player) {
		playerDao.savePlayer(player);
	}

	@Override
	public List<Player> getPlayers(String teamId) {
		return playerDao.getPlayers(teamId);
	}

	@Override
	public Player getPlayer(String playerId) {
		return playerDao.getPlayer(playerId);
	}
	
}

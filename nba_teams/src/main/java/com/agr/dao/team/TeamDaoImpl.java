package com.agr.dao.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.agr.entity.team.Team;

@Repository
public class TeamDaoImpl implements TeamDao {
	
	@Autowired
	private MongoOperations mongoOperations;

	@Override
	public void saveTeam(Team team) {
		mongoOperations.save(team);
	}

	@Override
	public List<Team> getTeams() {
		return mongoOperations.findAll(Team.class);
	}

	@Override
	public Team getTeam(String teamId) {
		return mongoOperations.findById(teamId, Team.class);
	}
}

package com.agr.service.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agr.dao.team.TeamDao;
import com.agr.entity.team.Team;

@Service
public class TeamServicesImpl implements TeamServices {
	
	@Autowired
	private TeamDao teamDao;

	@Override
	public void saveTeam(Team team) {
		teamDao.saveTeam(team);
	}

	@Override
	public List<Team> getTeams() {
		return teamDao.getTeams();
	}

	@Override
	public Team getTeam(String teamId) {
		return teamDao.getTeam(teamId);
	}

}

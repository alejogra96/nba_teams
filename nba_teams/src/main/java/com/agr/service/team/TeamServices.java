package com.agr.service.team;
import java.util.List;

import com.agr.entity.team.Team;

public interface TeamServices {
	void saveTeam(Team team);
	List<Team> getTeams();
	Team getTeam(String teamId);

}

package com.agr.dao.team;
import java.util.List;

import com.agr.entity.team.Team;

public interface TeamDao {
	void saveTeam(Team team);
	List<Team> getTeams();
	Team getTeam(String teamId);

}

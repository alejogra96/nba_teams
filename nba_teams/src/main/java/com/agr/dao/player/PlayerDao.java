package com.agr.dao.player;

import java.util.List;

import com.agr.entity.player.Player;


public interface PlayerDao {
	void savePlayer(Player player);
	List<Player> getPlayers(String teamId);
	Player getPlayer(String playerId);
}

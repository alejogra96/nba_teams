package com.agr.service.player;

import java.util.List;

import com.agr.entity.player.Player;

public interface PlayerServices {
	void savePlayer(Player player);
	List<Player> getPlayers(String teamId);
	Player getPlayer(String playerId);
}

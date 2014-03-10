package com.agr.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.agr.dto.util.ResponseDto;
import com.agr.dto.util.ResponseDto.ResponseStatus;
import com.agr.entity.player.Player;
import com.agr.entity.player.PlayerPositionEnum;
import com.agr.service.player.PlayerServices;

@Controller
public class PlayerController {

	@Autowired
	private PlayerServices playerServices;

	@RequestMapping(value = "/playerList")
	public ModelAndView getPlayers(ModelMap map, HttpServletRequest request, HttpServletResponse response, @RequestParam(required = true) String teamId) {
		map.put("playerList", playerServices.getPlayers(teamId));
		map.put("teamId", teamId);
		return new ModelAndView("bigbang/jsp/playerList.jsp");
	}

	@RequestMapping(value = "/player")
	public ModelAndView getPlayer(ModelMap map, HttpServletRequest request, HttpServletResponse response, @RequestParam(required = true) String teamId,
			@RequestParam(required = false) String playerId) {

		if (playerId != null && playerId.length() > 0) {
			map.put("player", playerServices.getPlayer(playerId));
		}

		map.put("positions", PlayerPositionEnum.values());
		map.put("teamId", teamId);
		return new ModelAndView("bigbang/jsp/player.jsp");
	}

	@RequestMapping(value = "/savePlayer", method = RequestMethod.POST)
	public @ResponseBody
	ResponseDto savePlayer(HttpServletRequest request, HttpServletResponse response, @RequestBody String jsonPlayer) throws JsonParseException,
			JsonMappingException, IOException {

		Player player = new ObjectMapper().readValue(jsonPlayer, Player.class);
		playerServices.savePlayer(player);
		ResponseDto responseDto = new ResponseDto();
		responseDto.setStatus(ResponseStatus.OK);
		responseDto.setRedirect("");
		return responseDto;
	}

}

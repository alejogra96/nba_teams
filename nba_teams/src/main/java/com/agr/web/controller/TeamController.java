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
import com.agr.entity.team.Team;
import com.agr.entity.team.TeamConferenceEnum;
import com.agr.service.team.TeamServices;

@Controller
public class TeamController {

	@Autowired
	private TeamServices teamServices;

	@RequestMapping(value = "/teamList")
	public ModelAndView getTeams(ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		map.put("teamList", teamServices.getTeams());
		return new ModelAndView("bigbang/jsp/teamList.jsp");
	}

	@RequestMapping(value = "/team")
	public ModelAndView getTeamsList(ModelMap map, HttpServletRequest request, HttpServletResponse response, @RequestParam(required = false) String teamId) {
		
		if(teamId != null && teamId.length() > 0){
			map.put("team", teamServices.getTeam(teamId));
		}
		
		map.put("conferences", TeamConferenceEnum.values());
		
		return new ModelAndView("bigbang/jsp/team.jsp");
	}

	@RequestMapping(value = "/saveTeam", method = RequestMethod.POST)
	public @ResponseBody
	ResponseDto saveTeam(HttpServletRequest request, HttpServletResponse response, @RequestBody String jsonTeam)
			throws JsonParseException, JsonMappingException, IOException {
		
		Team team = new ObjectMapper().readValue(jsonTeam, Team.class);
		teamServices.saveTeam(team);
		ResponseDto responseDto = new ResponseDto();
		responseDto.setStatus(ResponseStatus.OK);
		responseDto.setRedirect("");
		return responseDto;
	}
}

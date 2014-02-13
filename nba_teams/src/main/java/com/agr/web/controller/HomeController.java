package com.agr.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView getHomePage(ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("bigbang/jsp/home.jsp");
	}
	
}

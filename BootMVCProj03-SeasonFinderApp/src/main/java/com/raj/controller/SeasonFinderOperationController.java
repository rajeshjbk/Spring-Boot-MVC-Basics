package com.raj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raj.service.ISeasonFinderService;

@Controller
public class SeasonFinderOperationController {

	@Autowired
	private ISeasonFinderService seasonFinder;
	
	@RequestMapping("/")
	public String showHome() {
		
		//return LVN
		return "welcome";
	}
	
	@RequestMapping("season")
	public String showSeasonName(Map<String, Object> map) {
		
		//use service
		String seasonName = seasonFinder.showSeason();
		
		//keep results in model attribute
		map.put("seasonName", seasonName);
		
		//return LVN
		return "display";
	}
}

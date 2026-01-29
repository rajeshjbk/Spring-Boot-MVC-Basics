package com.raj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.raj.service.ISeasonFinderService;

@Controller
@RequestMapping("/season") //global path
public class SeasonFinderOperationController {

	@Autowired
	private ISeasonFinderService seasonFinder;

	/*@RequestMapping("/report")
	public String showReport1(Map<String, Object> map) {

		System.out.println("SeasonFinderOperationController.showReport()");
		return "report1";
	}*/

	/*@RequestMapping({"/report1","/report2","/report3"})
	public String showReport2(Map<String, Object> map) {

		System.out.println("SeasonFinderOperationController.showReport()");

		return "report2";
	}*/

//	@RequestMapping(value = "/report", method = RequestMethod.GET)
	@GetMapping("/report")
	public String showReport1(Map<String, Object> map) {

		System.out.println("SeasonFinderOperationController.showReport1()");

//		return "report1";
//		return "forward:/test/report";
		return "redirect:/test/report";
	}

//	@RequestMapping(value="/report", method = RequestMethod.POST)
	@PostMapping("/report")
	public String showReport2(Map<String, Object> map) {

		System.out.println("SeasonFinderOperationController.showReport2()");

		return "report2";
	}
	
	//	@RequestMapping("/")
	@RequestMapping
	public String showHome() {

		//return LVN
		return "welcome";
	}

	@RequestMapping("/season")
	public String showSeasonName(Map<String, Object> map) {

		//use service
		String seasonName = seasonFinder.showSeason();

		//keep results in model attribute
		map.put("seasonName", seasonName);

		//return LVN
		return "display";
	}
}

package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test") //global path
public class TestController {

	@GetMapping("/report")
	public String showReport2(Map<String, Object> map) {

		System.out.println("SeasonFinderOperationController.showReport1()");

		return "report2";
	}
}

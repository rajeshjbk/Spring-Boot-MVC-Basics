package com.raj.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationsController {

	@GetMapping("/")
	public String showHome() {
		
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/offers")
	public String showOffersPage() {
		
		return "show-offers";
	}
	
	@GetMapping("/balance")
	public String showBalance(Map<String, Object> map) {
		//model attribute
		map.put("balance", new Random().nextInt(100000000));
		
		return "show-balance";
	}
	
	@GetMapping("/approve")
	public String approveLoan(Map<String, Object> map) {
		//model attribute
		map.put("amount", new Random().nextInt(200000000));
		
		return "loan-approve";
	}
	
	@GetMapping("/denied")
	public String showDeniedPage() {
		
		//return LVN
		return "access-denied";
	}
}

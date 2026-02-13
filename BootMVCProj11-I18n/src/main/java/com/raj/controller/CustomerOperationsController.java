package com.raj.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.raj.model.Customer;

@Controller
public class CustomerOperationsController {

	@GetMapping("/")
	public String showHome(Map<String,Object> map) {
		
		//add the model attributes
		map.put("sysDate", new Date());
		map.put("price", new Random().nextInt(1000000));
		map.put("distance", new Random().nextDouble(200000000.0));
		map.put("avg", 0.45);
		
		return "welcome";
		
	}
	
	@GetMapping("/register")
	public String showCustomerRegistrationPage(@ModelAttribute("cust")Customer cust) {
		
		//return LVC
		return "customer-register-form";
	}
	
}

package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationsContrller {

	/*@GetMapping("/data")
	public String readData(@RequestParam("sno")int no, @RequestParam("sname")String name) {
		
		System.out.println("sno="+no+" ... sname="+name);
		
		//return LVN
		return "show-data";
	}*/
	
	@GetMapping("/data")
	public String readData(@RequestParam(required = false, defaultValue = "3001") Integer sno, 
			               @RequestParam(required = false,defaultValue = "VARANASI") String sname) {
		
		System.out.println("sno="+sno+" ... sname="+sname);
		
		//return LVN
		return "show-data";
	}

}

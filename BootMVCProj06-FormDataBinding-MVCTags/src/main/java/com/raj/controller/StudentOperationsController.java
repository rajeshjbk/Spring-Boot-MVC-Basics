package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.model.Student;

@Controller
public class StudentOperationsController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("StudentOperationsController.showHome()");
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showStudentRegistrationFormPage(@ModelAttribute("st")Student stud) {
		
		System.out.println("StudentOperationsController.showStudentRegistrationFormPage()");
		//return LVN (form page)
		return "student-register";
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute("stud") Student st, Map<String, Object>map) {
		
		System.out.println("StudentOperationsController.registerStudent():: "+st);
		//b.logic
		if(st.getAvg()<35)
			map.put("result", "fail");
		else
			map.put("result", "pass");
		//return LVN
		return "display";
	}
}

package com.raj.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")   // global path
public class BankOperationsController {

	@GetMapping("/welcome") 
	public ResponseEntity<String> showHome() {
		return new ResponseEntity<String>(
				"welcome to home Page ::",
				HttpStatus.OK
				);
	}

	@GetMapping("/offers")
	public ResponseEntity<String> showOffers() {
		return new ResponseEntity<String>(
				"offer page",
				HttpStatus.OK
				);
	}

	@GetMapping("/approve")
	@PreAuthorize("hasAuthority('MANAGER')")
	public ResponseEntity<String> approveLoan() {
		int amount = new Random().nextInt(1200000);
		return new ResponseEntity<String>(
				"Approved Loan amount::" + amount,
				HttpStatus.OK
				);
	}

	@GetMapping("/balance")
	@PreAuthorize("hasAnyAuthority('MANAGER','CUSTOMER')")
	public ResponseEntity<String> showBalancePage(Map<String, Object> map) {
		int amount = new Random().nextInt(200000);
		return new ResponseEntity<String>(
				"Account Balance is ::" + amount,
				HttpStatus.OK
				);
	}

}

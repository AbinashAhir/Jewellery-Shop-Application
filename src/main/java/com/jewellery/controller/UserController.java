package com.jewellery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jewellery.entity.Registration;
import com.jewellery.service.RegistrationService;

@RestController
public class UserController {
	@Autowired
	private RegistrationService rs;
	

	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Registration reg) {
		System.out.println(reg);
		return rs.addReg(reg);
	}
}

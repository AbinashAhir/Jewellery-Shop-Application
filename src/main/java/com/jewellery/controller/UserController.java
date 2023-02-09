package com.jewellery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jewellery.entity.User;
import com.jewellery.service.RegistrationService;

@RestController
public class UserController {
	@Autowired
	private RegistrationService rs;
	

	@PostMapping("/register")
	public String home() {
		return "Registration";
	}
	
	@PostMapping("/login")
	public String add(@RequestBody User reg) {
		System.out.println(reg);
		return rs.addReg(reg);
	}
}

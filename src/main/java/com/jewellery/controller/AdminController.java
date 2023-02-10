package com.jewellery.controller;

import com.jewellery.service.AdminService;
import com.jewellery.service.RegistrationService;
import com.jewellery.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	@Autowired
	private RegistrationService rs;

	@Autowired
	private AdminService as;

	@PostMapping("/add")
	public String addVendor(@RequestBody User user) {
		return as.addVendor(user);
	}

	@PutMapping("/update")
	public String updateVendor(@RequestBody User user) {
		return as.updateVendor(user);
	}

	@DeleteMapping("/delete/{userId}")
	public String deleteVender(@PathVariable("userId") Integer userId) {
		return as.deleteVendor(userId);
	}
}

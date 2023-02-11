package com.jewellery.controller;

<<<<<<< HEAD
import com.jewellery.auth.AuthenticationResponse;
import com.jewellery.auth.AuthenticationService;
import com.jewellery.auth.RegisterRequest;
=======
>>>>>>> e075f88f93be9e01e69cff58b959e981f385dccc
import com.jewellery.service.AdminService;
import com.jewellery.service.RegistrationService;
import com.jewellery.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	private AuthenticationService service;
	
	@Autowired
	private RegistrationService rs;

	@Autowired
	private AdminService as;

	@PostMapping("/addVendor")
	public String addVendor(@RequestBody RegisterRequest request) {
		service.addvendor(request);
		return "Addes";
	}
	


	@PutMapping("/updateVendor")
	public String updateVendor(@RequestBody User user) {
		return as.updateVendor(user);
	}

	@DeleteMapping("/deleteVender/{userId}")
	public String deleteVender(@PathVariable("userId") Integer id) {
		return as.deleteVendor(id);
	}
}

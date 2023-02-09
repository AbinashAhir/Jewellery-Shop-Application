package com.jewellery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jewellery.entity.Product;
import com.jewellery.entity.Registration;
import com.jewellery.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {
	
	@Autowired
	private VendorService vs ;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product pd) {
		return vs.addProduct(pd);
	}

}

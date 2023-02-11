package com.jewellery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jewellery.entity.Billing;
import com.jewellery.entity.Product;
import com.jewellery.service.VendorService;

@RestController
@RequestMapping("/api/v1/vendor")
public class VendorController {

	@Autowired
	private VendorService vs;

	@PostMapping("/add")
	public String addProduct(@RequestBody Product pd) {
		return vs.addProduct(pd);
	}

	@PutMapping("/update")
	public String updateProduct(@RequestBody Product product) {
		return vs.updateProduct(product);
	}

	@DeleteMapping("/delete")
	public String deleteProduct(@RequestBody Product pd) {
		return vs.deleteProduct(pd);
	}

//	@GetMapping("/billing/{customerId}/{purchaseId}")
//	public Billing getBillingById(@PathVariable("customerId") Integer customerId,
//			@PathVariable("purchaseId") Integer purchaseId) {
//		return vs.getBillingById(customerId, purchaseId);
//	}

}

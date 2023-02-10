package com.jewellery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jewellery.entity.Product;
import com.jewellery.repository.CustomerRepository;
import com.jewellery.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/home")
	public String home() {
		return "Hey home";
	}
	
	 
	@GetMapping("/search/{productName}")
	public Product getAllProductByProductName(@PathVariable("productName") String productName){
		return cs.getAllProductByProductName(productName);
	}
	
	@GetMapping("/search/{productid}")
	public Product getAllProductByProductId(@PathVariable("productid") Integer productid){
		return cs.getAllProductByProductId(productid);
	}
	
	@GetMapping("/view")
	public List<Product> getAllProduct(){
		return cs.getAllProduct();
	}
	@GetMapping("/purchase/{productName}")
	public Product getProduct(@PathVariable("productName") String productName){
		return cs.getProduct(productName);
	}
	@GetMapping("/feedback/{productName}")
	public Product getFeedbackByProductName(@PathVariable("productName")String productName){
		return cs.getFeedbackByProductName("productName");
	}

	
}

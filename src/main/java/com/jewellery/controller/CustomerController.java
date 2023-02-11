package com.jewellery.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jewellery.entity.Feedback;
import com.jewellery.entity.Product;
import com.jewellery.entity.Purchase;
import com.jewellery.repository.ProductRepository;
import com.jewellery.service.CustomerService;
import com.jewellery.user.User;

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
	
	@GetMapping("/viewProducts")
	public List<Product> getAllProduct(){
		return cs.getAllProduct();
	}
	@PostMapping("/purchase/{uid}/{pid}")
	public String purchaseProduct(@RequestBody Purchase purchase, @PathVariable("uid")int uid ,@PathVariable("pid")int pid){
		User user =cs.getUserById(uid);
		purchase.setUser(user);
		Product product =cs.getProductById(pid);
		purchase.setProduct(product);
		cs.savePurchase(purchase);
		return "Product Purchased by " + user.getFirstname();
	}
	@PostMapping("/feedback/{customerId}/{purchaseId}")
	public String giveFeedbackByProductName(@RequestBody Feedback feedback, @PathVariable("customerId")int customerId , @PathVariable("purchaseId")int purchaseId){
		User user = cs.getUserById(purchaseId);
		feedback.setUser(user);
		Purchase purchase = cs.getPurchaseById(purchaseId);
		feedback.setPurchase(purchase);
		Product product = cs.getProductById(purchaseId);
		feedback.setProduct(product);
		cs.saveFeedBack(feedback);
		return feedback.getFeedback();
	}

	
}

package com.jewellery.service;

import java.util.List;

import com.jewellery.entity.Product;
import com.jewellery.entity.User;

public interface CustomerService {

	public Product getAllProductByProductId(Integer productId);
	public Product getAllProductByProductName(String productName);
	public List<Product> getAllProduct();
	public Product getProduct(String productName);
	public Product getFeedbackByProductName(String productName);

	
	
	
	
}

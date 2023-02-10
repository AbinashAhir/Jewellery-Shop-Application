package com.jewellery.service;

import java.util.List;

import com.jewellery.entity.Product;
<<<<<<< HEAD
import com.jewellery.user.User;
=======
import com.jewellery.entity.User;
>>>>>>> 5225fdaae083df5ebbdfdb74541dbd0da7ab0f06

public interface CustomerService {

	public Product getAllProductByProductId(Integer productId);
	public Product getAllProductByProductName(String productName);
	public List<Product> getAllProduct();
	public Product getProduct(String productName);
	public Product getFeedbackByProductName(String productName);

	
	
	
	
}

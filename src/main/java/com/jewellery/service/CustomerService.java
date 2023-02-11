package com.jewellery.service;

import java.util.List;
import java.util.Optional;

import com.jewellery.entity.Feedback;
import com.jewellery.entity.Product;
import com.jewellery.entity.Purchase;
import com.jewellery.user.User;




public interface CustomerService {

	public Product getAllProductByProductId(Integer productId);
	public Product getAllProductByProductName(String productName);
	public List<Product> getAllProduct();
	public Product getProduct(String productName);
	public Product getFeedbackByProductName(String productName);

	public String purchaseProduct(int uid, int pid);
	public User getUserById(int uid);
	public Product getProductById(int pid);
	public void savePurchase(Purchase purchase);
	public Purchase getPurchaseById(int purchaseId);
	public void saveFeedBack(Feedback feedback);

	
	
	
	
}

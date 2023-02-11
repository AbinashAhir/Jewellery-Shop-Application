package com.jewellery.service;

import java.util.List;
import java.util.Optional;

import com.jewellery.entity.Feedback;
import com.jewellery.entity.Product;
<<<<<<< HEAD
import com.jewellery.entity.Purchase;
=======

>>>>>>> e075f88f93be9e01e69cff58b959e981f385dccc
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

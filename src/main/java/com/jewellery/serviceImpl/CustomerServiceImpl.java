package com.jewellery.serviceImpl;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jewellery.entity.Feedback;
import com.jewellery.entity.Product;
<<<<<<< HEAD
import com.jewellery.entity.Purchase;
import com.jewellery.user.User;
import com.jewellery.user.UserRepository;
import com.jewellery.repository.FeedbackRepository;
import com.jewellery.repository.ProductRepository;
import com.jewellery.repository.PurchaseRepository;
=======

import com.jewellery.user.User;


import com.jewellery.repository.CustomerRepository;
>>>>>>> e075f88f93be9e01e69cff58b959e981f385dccc
import com.jewellery.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Override
	public Product getAllProductByProductId(Integer productId) {
		return productRepository.findById(productId).orElse(null);
	}

//	@Override
//	public List<Product> getAllProductByProductName(String productName) {
//		return crepo.findAll().stream().filter(e->e.productName).toList();
//	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getAllProductByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getFeedbackByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String purchaseProduct(int uid, int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int uid) {
		User userById = userRepository.findById(uid).get();
		return userById;
	}

	@Override
	public Product getProductById(int pid) {
		Product product =productRepository.findById(pid).get();
		return product;
	}

	@Override
	public void savePurchase(Purchase purchase) {
		purchaseRepository.save(purchase);
		
	}

	@Override
	public Purchase getPurchaseById(int purchaseId) {
		Optional<Purchase> purchaseById = purchaseRepository.findById(purchaseId);
		Purchase purchase = purchaseById.get();
		return purchase;
	}

	@Override
	public void saveFeedBack(Feedback feedback) {
		feedbackRepository.save(feedback);
		
	}




//	@Override
//	public Product getProduct(String productName) {
//		return crepo.findProduct(productName).orElse(null);
//	}
//
//	@Override
//	public Product getFeedbackByProductName(String string) {
//		return crepo.findProduct(productName).orElse(null);
//	}

	

	

}

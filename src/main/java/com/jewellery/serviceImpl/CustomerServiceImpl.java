package com.jewellery.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jewellery.entity.Product;
<<<<<<< HEAD
import com.jewellery.user.User;
=======
import com.jewellery.entity.User;
>>>>>>> 5225fdaae083df5ebbdfdb74541dbd0da7ab0f06
import com.jewellery.repository.CustomerRepository;
import com.jewellery.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository crepo;

	@Override
	public Product getAllProductByProductId(Integer productId) {
		return crepo.findById(productId).orElse(null);
	}

//	@Override
//	public List<Product> getAllProductByProductName(String productName) {
//		return crepo.findAll().stream().filter(e->e.productName).toList();
//	}

	@Override
	public List<Product> getAllProduct() {
		return crepo.findAll();
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

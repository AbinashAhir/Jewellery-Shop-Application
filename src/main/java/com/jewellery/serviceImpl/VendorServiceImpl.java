package com.jewellery.serviceImpl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jewellery.entity.Billing;
import com.jewellery.entity.Product;
import com.jewellery.entity.Purchase;
<<<<<<< HEAD
import com.jewellery.user.User;
=======
import com.jewellery.entity.User;
>>>>>>> 5225fdaae083df5ebbdfdb74541dbd0da7ab0f06
import com.jewellery.repository.PurchaseRepository;
import com.jewellery.repository.RegistrationRepository;
import com.jewellery.repository.VendorRepository;
import com.jewellery.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vp;

	@Autowired
	private RegistrationRepository rp;

	@Autowired
	private PurchaseRepository pp;

	@Override
	public String addProduct(Product pd) {
		vp.save(pd);
		return "Product Added";
	}

	@Override
	public String updateProduct(Product pd) {
		vp.save(pd);
		return "Product Updated";
	}

	@Override
	public String deleteProduct(Product pd) {
		vp.delete(pd);
		return "Product Deleted";
	}

	@Override
	public Billing getBillingById(Integer customerId, Integer purchaseId) {
//		Billing bl = new Billing();
//		bl.setCustomerId(customerId);
//		Registration user = rp.findById(customerId).orElse(null);
//
//		if (user != null) {
//			return user.getPurchases().stream().map(Purchase::getProduct).collect(Collectors.toList());
//
//		} else {
//			return null;
//		}
		return null;

	}

}

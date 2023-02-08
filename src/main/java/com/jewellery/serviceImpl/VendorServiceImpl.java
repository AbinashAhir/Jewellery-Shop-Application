package com.jewellery.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jewellery.entity.Product;
import com.jewellery.repository.VendorRepository;
import com.jewellery.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepository vp;

	@Override
	public String addProduct(Product pd) {
	    vp.save(pd);
		return "Product Added";
	}

}

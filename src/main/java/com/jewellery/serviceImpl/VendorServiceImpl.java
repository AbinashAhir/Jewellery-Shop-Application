package com.jewellery.serviceImpl;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jewellery.entity.Billing;
import com.jewellery.entity.Product;
import com.jewellery.entity.Purchase;

import com.jewellery.user.User;
<<<<<<< HEAD
import com.jewellery.repository.ProductRepository;
=======


>>>>>>> e075f88f93be9e01e69cff58b959e981f385dccc
import com.jewellery.repository.PurchaseRepository;
import com.jewellery.repository.RegistrationRepository;
import com.jewellery.repository.VendorRepository;
import com.jewellery.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vp;
	
	@Autowired
	private ProductRepository productRepository;

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
	public String updateProduct(Product product) {
		Product productId = productRepository.findById(product.getProductId()).get();

		if (Objects.nonNull(product.getProductId())) {

			productId.setProductId(product.getProductId());
		}

		
		if(Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
			productId.setProductName(product.getProductName());
		}

		if (Objects.nonNull(product.getProductMaterial()) && !"".equalsIgnoreCase(product.getProductMaterial())) {
			productId.setProductMaterial(product.getProductMaterial());
		}
		
		if(Objects.nonNull(product.getProductWeight())) {
			productId.setProductWeight(product.getProductWeight());
		}
		
		if(Objects.nonNull(product.getProductGmPerWeight())) {
			productId.setProductGmPerWeight(product.getProductGmPerWeight());
		}
		
		if(Objects.nonNull(product.getProductQuantity())) {
			productId.setProductQuantity(product.getProductQuantity());
		}
		
		if(Objects.nonNull(product.getProductCost())) {
			productId.setProductCost(product.getProductCost());
		}

		vp.save(productId);

		return productId.getProductName() + " updated successfully";
	}

	@Override
	public String deleteProduct(Product product) {
		Product productId = productRepository.findById(product.getProductId()).get();
		var temp=productId.getProductName().toString();
		productRepository.deleteById(productId.getProductId());
		return temp+" Product Deleted";
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

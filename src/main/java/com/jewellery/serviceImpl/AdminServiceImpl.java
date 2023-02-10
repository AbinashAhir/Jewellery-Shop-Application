package com.jewellery.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jewellery.repository.AdminRepository;
import com.jewellery.service.AdminService;
import com.jewellery.user.User;

public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository ar;

	@Override
	public String addVendor(User user) {
		ar.save(user);
		return "Vendor addded successfully";
	}

	@Override
	public List<User> getAllUser() {
		return ar.findAll();
	}

	@Override
	public String updateVendor(User user) {
		ar.save(user);
		return "Vendor updated successfully";
	}

	@Override
	public String deleteVendor(Integer userId) {
		return "Vendor deleted successfully";
		
	}
}

package com.jewellery.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jewellery.user.User;


public interface AdminService{
<<<<<<< HEAD
	
=======
>>>>>>> e075f88f93be9e01e69cff58b959e981f385dccc
	public String addVendor(User user);

	List<User> getAllUser();
	

	public String updateVendor(User user);

	public String deleteVendor(Integer userId);
}
package com.jewellery.service;

import java.util.List;
import com.jewellery.user.User;

public interface AdminService {
	public String addVendor(User user);

	List<User> getAllUser();

	public String updateVendor(User user);

	public String deleteVendor(Integer userId);
}
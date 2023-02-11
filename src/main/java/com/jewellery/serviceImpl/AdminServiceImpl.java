package com.jewellery.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jewellery.auth.AuthenticationService;
import com.jewellery.repository.AdminRepository;
import com.jewellery.service.AdminService;
import com.jewellery.user.User;
import com.jewellery.user.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository ar;

	@Autowired
	private AuthenticationService authserv;

	@Autowired
	private UserRepository ur;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addVendor(User user) {
		User us = ur.findById(user.getId()).get();

		if (Objects.nonNull(user.getId())) {

			us.setId(user.getId());
		}

		if (Objects.nonNull(user.getFirstname()) && !"".equalsIgnoreCase(user.getFirstname())) {
			us.setFirstname(user.getFirstname());
		}

		if (Objects.nonNull(user.getLastname()) && !"".equalsIgnoreCase(user.getLastname())) {
			us.setLastname(user.getLastname());
		}

		if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
			us.setEmail(user.getEmail());
		}

		if (Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {

			us.setPassword(passwordEncoder.encode(user.getPassword()));
		}

		if (Objects.nonNull(user.getPhoneNumber())) {
			us.setPhoneNumber(user.getPhoneNumber());
		}

		if (Objects.nonNull(user.getAddress()) && !"".equalsIgnoreCase(user.getAddress())) {
			us.setAddress(user.getAddress());
		}

		if (Objects.nonNull(user.getRole())) {
			us.setRole(user.getRole());
		}

		ur.save(us);

//		String usi = us.getFirstname() + us.getLastname();

		return "Vendor " + us.getFirstname() + " " + us.getLastname() + " added successfully";

	}

	@Override
	public List<User> getAllUser() {
		return ar.findAll();
	}

	@Override
	public String updateVendor(User user) {
		User us = ur.findById(user.getId()).get();

		if (Objects.nonNull(user.getId())) {

			us.setId(user.getId());
		}

		if (Objects.nonNull(user.getFirstname()) && !"".equalsIgnoreCase(user.getFirstname())) {
			us.setFirstname(user.getFirstname());
		}

		if (Objects.nonNull(user.getLastname()) && !"".equalsIgnoreCase(user.getLastname())) {
			us.setLastname(user.getLastname());
		}

		if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
			us.setEmail(user.getEmail());
		}

		if (Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {

			us.setPassword(passwordEncoder.encode(user.getPassword()));
		}

		if (Objects.nonNull(user.getPhoneNumber())) {
			us.setPhoneNumber(user.getPhoneNumber());
		}

		if (Objects.nonNull(user.getAddress()) && !"".equalsIgnoreCase(user.getAddress())) {
			us.setAddress(user.getAddress());
		}

		if (Objects.nonNull(user.getRole())) {
			us.setRole(user.getRole());
		}

		ur.save(us);

//		String usi = us.getFirstname() + us.getLastname();

		return "Vendor " + us.getFirstname() + " " + us.getLastname() + " updated successfully";
	}

	@Override
	public String deleteVendor(Integer userId) {
		var temp = ur.findById(userId).get().getEmail();
		ur.deleteById(userId);
		return "Vendor " + temp + " deleted successfully";

	}
}

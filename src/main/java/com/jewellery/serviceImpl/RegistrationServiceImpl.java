package com.jewellery.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jewellery.user.User;


import com.jewellery.repository.RegistrationRepository;
import com.jewellery.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository rp;
	
	@Override
	public String addReg(User reg) {
		rp.save(reg);
		return "Added Successfully";
	}

}

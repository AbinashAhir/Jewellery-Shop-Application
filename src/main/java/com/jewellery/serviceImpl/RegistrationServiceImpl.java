package com.jewellery.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.jewellery.user.User;
=======
import com.jewellery.entity.User;
>>>>>>> 5225fdaae083df5ebbdfdb74541dbd0da7ab0f06
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

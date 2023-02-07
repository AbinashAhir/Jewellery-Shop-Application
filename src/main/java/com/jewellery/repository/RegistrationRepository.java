package com.jewellery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jewellery.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

}

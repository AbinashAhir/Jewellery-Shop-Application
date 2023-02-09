package com.jewellery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jewellery.entity.User;

public interface RegistrationRepository extends JpaRepository<User, Integer>{

}

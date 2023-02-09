package com.jewellery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jewellery.entity.Product;
import com.jewellery.entity.User;

public interface CustomerRepository extends JpaRepository<Product ,Integer > {

	

	

}

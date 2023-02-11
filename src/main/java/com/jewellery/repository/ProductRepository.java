package com.jewellery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jewellery.entity.Product;

import com.jewellery.user.User;



@Repository
public interface ProductRepository extends JpaRepository<Product ,Integer > {

	

	

	

}

package com.jewellery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jewellery.entity.Product;

@Repository
public interface VendorRepository extends JpaRepository<Product ,Integer> {

}

package com.jewellery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jewellery.entity.Purchase;


	@Repository
	public interface PurchaseRepository extends JpaRepository<Purchase ,Integer> {

	}




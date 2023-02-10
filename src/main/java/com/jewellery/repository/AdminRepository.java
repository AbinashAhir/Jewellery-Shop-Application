package com.jewellery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jewellery.user.User;

@Repository
public interface AdminRepository extends JpaRepository<User, Integer>{

}

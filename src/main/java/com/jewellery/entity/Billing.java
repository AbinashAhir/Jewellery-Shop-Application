package com.jewellery.entity;

import java.sql.Date;
import java.util.List;

import com.jewellery.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billing {
	
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private  long id;

@OneToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name="userid", referencedColumnName ="id" )
private User user;


@OneToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name="purchaseid", referencedColumnName = "purchaseid")
private Purchase purchase;
	


	
	

}

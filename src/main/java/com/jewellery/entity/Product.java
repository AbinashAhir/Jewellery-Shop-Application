package com.jewellery.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Product implements Serializable  {
	
	private static final long serialVersionUID = -3966420328222306500L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productId;
	private String productName;
	private String productMaterial;;
	private double productWeight;
	private double productGmPerWeight;
	private int productQuantity;
	private double productCost;

	

}

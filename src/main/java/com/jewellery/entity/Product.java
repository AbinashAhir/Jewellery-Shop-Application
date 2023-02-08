package com.jewellery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Product {

	@Id
	public int productId;
	public String productName;
	public String productmaterial;
	public double productWeight;
	public double productGmPerWeight;
	public int productQuantity;
	public double productCost;
	
	
	public Product(int productId, String productName, String productmaterial, double productWeight,
			double productGmPerWeight, int productQuantity, double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productmaterial = productmaterial;
		this.productWeight = productWeight;
		this.productGmPerWeight = productGmPerWeight;
		this.productQuantity = productQuantity;
		this.productCost = productCost;
		
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

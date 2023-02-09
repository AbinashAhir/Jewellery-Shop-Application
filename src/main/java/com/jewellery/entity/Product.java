package com.jewellery.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	}
	
	@OneToOne
	public Feedback feedback;
	
	
	 @OneToOne(mappedBy = "product")
	    private Purchase purchase;

	

}

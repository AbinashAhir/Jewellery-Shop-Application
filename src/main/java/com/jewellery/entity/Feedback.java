package com.jewellery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	@Id
	
	private int customerId;
	private String customerName;
	private String productName;
	private String feedback;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [customerId=" + customerId + ", customerName=" + customerName + ", productName=" + productName
				+ ", feedback=" + feedback + "]";
	}

	public Feedback(int customerId, String customerName, String productName, String feedback) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.productName = productName;
		this.feedback = feedback;
	}

	public Feedback() {
		super();
	}
	
	
	}

package com.jewellery.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Billing {
	public double totalCost;
	@Id
	public int billno;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "fk_purchase_id")
	    private Purchase purchase;
	 
	 
	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int customerId;
	public Billing(double totalCost, int billno, int customerId) {
		super();
		this.totalCost = totalCost;
		this.billno = billno;
		this.customerId = customerId;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Billing [totalCost=" + totalCost + ", billno=" + billno + ", customerId=" + customerId + "]";
	}
	
	
}

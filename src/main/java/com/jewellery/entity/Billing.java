package com.jewellery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Billing {
	public double totalCost;
	@Id
	public int billno;
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

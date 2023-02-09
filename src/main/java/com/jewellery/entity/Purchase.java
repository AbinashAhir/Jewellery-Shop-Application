package com.jewellery.entity;

import java.util.List;
import java.util.stream.Stream;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "purchase_id")
	private int purchaseId;

	public Purchase(int purchaseId) {
		super();
		this.purchaseId = purchaseId;
	}

	public Purchase() {
		super();
	
	}
	
//	@Column(name = "purchase_date")
//    private Date purchaseDate;

    public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public List<Billing> getBillings() {
		return billings;
	}

	public void setBillings(List<Billing> billings) {
		this.billings = billings;
	}

	public List<Product> getProduct() {
		return products;
	}

	public void setProduct(List<Product> product) {
		this.products = product;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	@OneToMany(mappedBy = "billing", cascade = CascadeType.ALL)
    private List<Billing> billings;
	
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<Product> products;
    
    @ManyToOne
    private Registration registration;


	

   
}

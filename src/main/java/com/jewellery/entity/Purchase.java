package com.jewellery.entity;

import java.util.List;

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

    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
    private List<Billing> billings;
	
    @OneToOne
    private Product product;
    
    @ManyToOne
    private Registration registration;

   
}

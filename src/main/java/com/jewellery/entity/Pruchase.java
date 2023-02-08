package com.jewellery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pruchase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "pruchase_id")
	private int pruchaseId;

	public Pruchase(int pruchaseId) {
		super();
		this.pruchaseId = pruchaseId;
	}

	public Pruchase() {
		super();
	
	}
	
	
	


}

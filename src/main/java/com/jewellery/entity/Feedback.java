package com.jewellery.entity;

import com.jewellery.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "feedbackid")
   private long id;
	
	
	private String feedback;
	
	@OneToOne(cascade = CascadeType.PERSIST)
<<<<<<< HEAD
	@JoinColumn(name="userid", referencedColumnName = "id")
=======
	@JoinColumn(name="userid", referencedColumnName = "userId")
>>>>>>> 5225fdaae083df5ebbdfdb74541dbd0da7ab0f06
	private User user;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="productid", referencedColumnName = "productId")
	private Product product;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="purchaseid",referencedColumnName = "purchaseId")
	private Purchase purchase;

}
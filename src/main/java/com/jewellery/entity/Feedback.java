package com.jewellery.entity;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "feedback_id")
	private int feedbackId;
	private String feedback;

	public Feedback(int feedbackId, String feedback) {
		super();
		this.feedbackId = feedbackId;
		this.feedback = feedback;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_product_id")
	public Product product;
	
	    @OneToOne
	    private Registration registration;


}
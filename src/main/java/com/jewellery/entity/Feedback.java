package com.jewellery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}
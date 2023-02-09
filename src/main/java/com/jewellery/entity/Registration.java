package com.jewellery.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
	@Id
	private int userId;
	private String password;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String role;
	private String email;
	private String address;
	
	

	@OneToMany(mappedBy = "registration")
	private List<Purchase> purchases;

	@OneToOne(cascade=CascadeType.ALL,mappedBy="registration")
	@JoinColumn(name="fk_user_id")
	private Feedback feedback;

	

}

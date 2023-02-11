package com.jewellery.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import com.jewellery.user.User;

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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name= "purchaseid")
	private Long purchaseId;

    private Long quantity;
    
    
    @OneToOne(cascade = CascadeType.PERSIST)

   

    @JoinColumn(name="userid", referencedColumnName = "id")
    private User user;
    
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="productid", referencedColumnName = "productId")
    private Product product;
    
 


	

   
}

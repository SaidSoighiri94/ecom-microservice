package com.soighiri.billing_service.entities;

import org.hibernate.annotations.ManyToAny;

import com.soighiri.billing_service.dto.ProductDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
public class ProductItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productId;
	@ManyToAny 
	private Bill bill;
	private int quantity;
	private double unitPrice;
	
	@Transient
	private ProductDto product;
	
}

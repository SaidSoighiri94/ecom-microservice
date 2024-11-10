package com.soighiri.inventory_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	private double price;
	private int quantity;
	

}

package com.soighiri.inventory_service;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.soighiri.inventory_service.entities.Product;
import com.soighiri.inventory_service.repository.ProductRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository) {
		return args -> {
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Computer")
					.description("ORdi Puissant")
					.quantity(23)
					.price(12.344)
					
					.build()
					);
			
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Samsung S23")
					.description("Galaxy S23 neuf")
					.quantity(33)
					.price(342.344)
					
					.build()
					);
			
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Print")
					.description("Imprimante casio")
					.quantity(266)
					.price(22.344)
					
					.build()
					);
			
			
			// POUR AFFICHER LES INFORMATION AU DEMMARAGE
			productRepository.findAll().forEach(prod -> {
				System.out.println(prod.toString());
			});
			
		};
	}

}

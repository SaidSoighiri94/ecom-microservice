package com.soighiri.customer_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.soighiri.customer_service.entities.Customer;
import com.soighiri.customer_service.repository.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	// Ajout de donner au demarrage de l'application
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args ->{
			customerRepository.save(Customer.builder()
					.name("Mohamed")
					.email("med@gmail.com")
				.build());
			customerRepository.save(Customer.builder()
					.name("Said")
					.email("sai@gmail.com")
					.build());
			
			customerRepository.save(Customer.builder()
					.name("Soighir")
					.email("soig@gmail.com")
					.build());
			
			customerRepository.save(Customer.builder()
					.name("Zakri")
					.email("Zak@gmail.com")
					.build());
			customerRepository.findAll().forEach(cust-> {
				System.out.println("==========================");
				System.out.println(cust.getId());
				System.out.println(cust.getName());
				System.out.println(cust.getEmail());
				System.out.println("===========================");
			});
			
		};
	}

}

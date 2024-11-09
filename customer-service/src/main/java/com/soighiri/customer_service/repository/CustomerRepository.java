package com.soighiri.customer_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soighiri.customer_service.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

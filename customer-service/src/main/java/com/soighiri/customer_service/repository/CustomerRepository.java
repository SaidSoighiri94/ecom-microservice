package com.soighiri.customer_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.soighiri.customer_service.entities.Customer;
@RepositoryRestResource

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

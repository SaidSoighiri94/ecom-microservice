package com.soighiri.billing_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soighiri.billing_service.entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}

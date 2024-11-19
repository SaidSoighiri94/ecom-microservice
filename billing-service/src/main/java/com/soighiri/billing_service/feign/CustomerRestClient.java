package com.soighiri.billing_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.soighiri.billing_service.dto.CustomerDto;

@FeignClient(name ="customer-service")
public interface CustomerRestClient {
	@GetMapping(value = "/api/customer-service/{id}")
	CustomerDto findCustomerDtoById(Long id);
	

}

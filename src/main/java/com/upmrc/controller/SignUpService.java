package com.upmrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upmrc.domain.Customer;
import com.upmrc.repository.SignupRepository;

@Service
public class SignUpService {

	@Autowired
	SignupRepository respository;
	
	public boolean saveCustomer(Customer customer) {
		respository.save(customer);
	}
}

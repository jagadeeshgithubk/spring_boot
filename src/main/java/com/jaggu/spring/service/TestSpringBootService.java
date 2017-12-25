package com.jaggu.spring.service;

import org.springframework.stereotype.Service;

import com.jaggu.spring.models.Customer;

@Service
public class TestSpringBootService {

	public Customer getDetails(){
		return new Customer("James", 123, "TPT");
	}
}

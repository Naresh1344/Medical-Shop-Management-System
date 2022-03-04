package com.example.medicalshopmanagementsystem.service;

import java.util.List;

import com.example.medicalshopmanagementsystem.entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Customer theCustomer);
	
	public void deleteById(int theId);
	

}

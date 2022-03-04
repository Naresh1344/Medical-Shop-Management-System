package com.example.medicalshopmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.medicalshopmanagementsystem.dao.CustomerRepository;
import com.example.medicalshopmanagementsystem.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
		customerRepository = theCustomerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(int theId) {
		Optional<Customer> result = customerRepository.findById(theId);
		
		Customer theCustomer = null;
		
		if(result.isPresent())
		{
			theCustomer = result.get();
		}
		else
		{
			//we didn't find the Customer
			throw new RuntimeException("Did not find Customer id- "+theId);
		}
		return theCustomer;
	}

	@Override
	public void save(Customer theCustomer) {
		customerRepository.save(theCustomer);
		
	}

	@Override
	public void deleteById(int theId) {
		customerRepository.deleteById(theId);
		
	}
	

}

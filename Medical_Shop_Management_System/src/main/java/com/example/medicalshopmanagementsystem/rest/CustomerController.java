package com.example.medicalshopmanagementsystem.rest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.medicalshopmanagementsystem.entity.Customer;
import com.example.medicalshopmanagementsystem.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController {

	private CustomerService customerService;
	
	public CustomerController(CustomerService theCustomerService) {
		
		customerService = theCustomerService;
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get Customer from database
		List<Customer> theCustomers = customerService.findAll();
		
		// add to the spring model
		theModel.addAttribute("customers", theCustomers);
		
		return "customers/list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customers/customer-form";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model theModel) {
		
		// get the Customer from the service
		Customer theCustomer = customerService.findById(theId);
		
		// set Customer as a model attribute to pre-populate the form
		theModel.addAttribute("customer", theCustomer);
		
		// send over to our form
		return "customers/customer-form";			
	}
	
	
	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// save the Customer
		customerService.save(theCustomer);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/customers/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("customerId") int theId) {
		
		// delete the Customer
		customerService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/customers/list";
		
	}
}

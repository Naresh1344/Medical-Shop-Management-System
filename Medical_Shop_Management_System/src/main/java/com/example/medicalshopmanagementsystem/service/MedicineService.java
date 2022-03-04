package com.example.medicalshopmanagementsystem.service;

import java.util.List;

import com.example.medicalshopmanagementsystem.entity.Medicine;


public interface MedicineService {
	
	public List<Medicine> findAll();
	
	public Medicine findById(int theId);
	
	public void save(Medicine theMedicine);
	
	public void deleteById(int theId);

}

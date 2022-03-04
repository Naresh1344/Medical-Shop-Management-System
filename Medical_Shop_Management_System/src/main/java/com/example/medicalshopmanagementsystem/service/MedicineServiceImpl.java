package com.example.medicalshopmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalshopmanagementsystem.dao.MedicineRepository;
import com.example.medicalshopmanagementsystem.entity.Medicine;

@Service
public class MedicineServiceImpl implements MedicineService {
	
	private MedicineRepository medicineRepository;
	
	public MedicineServiceImpl(MedicineRepository theMedicineRepository) {
		medicineRepository = theMedicineRepository;
	}

	@Override
	public List<Medicine> findAll() {
		return medicineRepository.findAll();
	}

	@Override
	public Medicine findById(int theId) {
		Optional<Medicine> result = medicineRepository.findById(theId);
		
		Medicine theMedicine = null;
		
		if(result.isPresent())
		{
			theMedicine = result.get();
		}
		else
		{
			//we didn't find the medicines
			throw new RuntimeException("Did not find Medicine id- "+theId);
		}
		return theMedicine;
		

	}

	@Override
	public void save(Medicine theMedicine) {
		medicineRepository.save(theMedicine);
		
	}

	@Override
	public void deleteById(int theId) {
		medicineRepository.deleteById(theId);
		
	}
	
	
	
	
	
}

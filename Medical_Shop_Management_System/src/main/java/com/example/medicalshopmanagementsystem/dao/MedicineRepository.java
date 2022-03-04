package com.example.medicalshopmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalshopmanagementsystem.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

}

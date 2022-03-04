package com.example.medicalshopmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalshopmanagementsystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}

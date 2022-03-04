package com.example.medicalshopmanagementsystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.medicalshopmanagementsystem.entity.User;
import com.example.medicalshopmanagementsystem.rest.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);
	}



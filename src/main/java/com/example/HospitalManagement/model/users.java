package com.example.HospitalManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class users {

	@Id
	private Long id;
	private String userName;
	private String password;
	private String role;
	
}

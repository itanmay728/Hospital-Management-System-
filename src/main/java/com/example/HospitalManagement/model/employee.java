package com.example.HospitalManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	@Column(unique = true)
	private String userName;

	private String image;
	
	private String address;
	
	private String phone;

	private String panNumber;

	private String aadhaar;

	private String accountHolderName;

	private String accountNumber;

	private String ifscCode;

	private String branchAddress;

	private String password;

	private String role;

}

package com.example.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HospitalManagement.model.employee;

public interface EmployeeRepository extends JpaRepository<employee, Long> {

}

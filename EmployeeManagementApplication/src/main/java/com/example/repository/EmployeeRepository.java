package com.example.repository;

import com.example.model.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findByName(String name);
}

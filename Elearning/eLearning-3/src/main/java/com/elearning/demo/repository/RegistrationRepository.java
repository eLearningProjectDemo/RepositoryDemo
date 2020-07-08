package com.elearning.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.demo.model.employee;

public interface RegistrationRepository extends JpaRepository<employee, Integer> {

	public employee findByEmail(String email);
	public employee findTopByOrderByEmpidDesc();

}

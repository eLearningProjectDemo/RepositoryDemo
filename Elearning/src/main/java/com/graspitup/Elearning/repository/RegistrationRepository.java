package com.graspitup.Elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graspitup.Elearning.model.employee;

public interface RegistrationRepository extends JpaRepository<employee, Integer> {

	
	public employee findByEmail(String email);

}

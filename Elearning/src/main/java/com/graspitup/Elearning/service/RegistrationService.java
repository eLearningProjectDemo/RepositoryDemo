package com.graspitup.Elearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graspitup.Elearning.model.employee;
import com.graspitup.Elearning.repository.RegistrationRepository;

@Service
public class RegistrationService<emailId> {
	@Autowired
	RegistrationRepository repo;

	public List<employee> findAll() {
		return (List<employee>) repo.findAll();
	}

	public employee findEmployeeByEmail(String email) {
		return repo.findByEmail(email);
	}

	public employee saveEmployee(employee employee1) {

		return repo.save(employee1);
	}

}

package com.graspitup.Elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graspitup.Elearning.model.employee;
import com.graspitup.Elearning.service.RegistrationService;

@RestController
//@RequestMapping("/secure/rest")
public class RegistrationController {

	@Autowired
	RegistrationService service;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@GetMapping("/employee")
	public List<employee> getEmployee() {
		System.out.println("getmapping called");
		return service.findAll();
	}

	@PostMapping("/register")
	public employee registerEmployee(@RequestBody final employee employee1) throws Exception {
		String tempEmail = employee1.getEmail();
		employee emp;
		emp = service.findEmployeeByEmail(tempEmail);
		if (emp != null) {
			throw new Exception("This email id already registered!");
		}
		System.out.println("calling register");

		String pwd = employee1.getPassword();
		String encryptPwd = passwordEncoder.encode(pwd);
		employee1.setPassword(encryptPwd);
		return service.saveEmployee(employee1);
	}

	@PostMapping("/login")
	@CrossOrigin("http://localhost:4200")
	public employee login(@RequestBody final employee employee1) throws Exception {
		String tempEmailId = employee1.getEmail();
		String tempPassword = employee1.getPassword();
		employee userObj = null;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (tempEmailId != null && tempPassword != null) {

			userObj = service.findEmployeeByEmail(tempEmailId);
		}
		if (userObj == null) {
			throw new Exception("user does not exist");
		} else {
			String pwd = userObj.getPassword();

			boolean isPasswordMatch = encoder.matches(tempPassword, pwd);

			if (isPasswordMatch == true) {
				System.out.println("password matched");

			} else {
				throw new Exception("incorrect password");

			}
		}
		return userObj;

	}
}
package com.elearning.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.demo.model.course;
import com.elearning.demo.model.employee;
import com.elearning.demo.repository.CourseRepository;
//import com.elearning.demo.repository.CoursesRepository;
import com.elearning.demo.repository.RegistrationRepository;
@Service
public class CourseService {
	@Autowired
	CourseRepository repo;

	public List<course> findAll() {
		return (List<course>) repo.findAll();
	}

	public course findCourseByCoursetitle(String tempTitle) {
		
		return repo.findByCoursetitle(tempTitle);
		//return null;
	}

	public course saveCourse(course course1) {
		return repo.save(course1);
	}

}

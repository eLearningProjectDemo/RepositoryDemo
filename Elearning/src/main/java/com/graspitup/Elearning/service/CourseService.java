package com.graspitup.Elearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graspitup.Elearning.model.course;
import com.graspitup.Elearning.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repo;

	

	public course findCourseByCoursetitle(String tempTitle) {
		
		return repo.findByCoursetitle(tempTitle);
		//return null;
	}

	public course saveCourse(course course1) {
		return repo.save(course1);
	}

	public List<course> findAll() {
		// TODO Auto-generated method stub
		return (List<course>) repo.findAll();
		
	}

}


package com.graspitup.Elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graspitup.Elearning.model.course;
import com.graspitup.Elearning.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService service;
	@GetMapping("/course")
	@CrossOrigin("http://localhost:4200")
	public List<course> getEmployee() {
		System.out.println("getmapping called in course");
		return service.findAll();
	}
	@PostMapping("/addcourse")
	@CrossOrigin("http://localhost:4200")
	public course addcourse(@RequestBody final course course1) throws Exception {
		String tempTitle= course1.getCoursetitle();
		course course;
		course = service.findCourseByCoursetitle(tempTitle);
		if (course != null) {
			throw new Exception("This course already exist!");
		}
		System.out.println("calling add course");

		
		return service.saveCourse(course1);
	}

}

package com.elearning.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;

import com.elearning.demo.model.course;

public interface CourseRepository extends JpaRepository<course, Integer> {

	public course findByCoursetitle( String course1);

}

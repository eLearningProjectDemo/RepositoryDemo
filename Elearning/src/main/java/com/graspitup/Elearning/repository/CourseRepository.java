package com.graspitup.Elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import  com.graspitup.Elearning.model.course;

public interface CourseRepository extends JpaRepository<course, Integer> {

	public course findByCoursetitle( String course1);

}

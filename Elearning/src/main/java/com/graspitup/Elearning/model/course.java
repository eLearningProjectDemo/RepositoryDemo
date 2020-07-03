package com.graspitup.Elearning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Entity
 @Data
 @XmlRootElement
public class course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int course_id;
	
	@Column(name = "coursetitle")
	private String coursetitle;
	@Column(name = "f_id")
	private int f_id;
	@Column(name = "instructor")
	private String instructor;
	@Column(name = "course_brief")
	private String course_brief;
	@Column(name = "numof_chapters")
	private int numof_chapters;
	

}

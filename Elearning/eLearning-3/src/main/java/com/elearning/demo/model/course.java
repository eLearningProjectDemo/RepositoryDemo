package com.elearning.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Entity
 @Data
 @XmlRootElement
public class course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id",nullable=false)
	private int course_id;
	
	@Column(name = "coursetitle")
	private String coursetitle;
	
	@Column(name = "instructor")
	private String instructor;
	@Column(name = "course_brief")
	private String course_brief;
	@Column(name = "numof_chapters")
	private int numof_chapters=4;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	 @JoinColumn(name="f_id")
	
	private employee employee1;
	
	

}

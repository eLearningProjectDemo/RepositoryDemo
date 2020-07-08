package com.elearning.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Entity
@Data
public class employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Column(name = "role")
	private String role;
	
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	/*@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employee1")
	//@JoinColumn(referencedColumnName = "course_id")
	private course course1;*/
	
	/*@Column(name = "job_title")
	private String job_title;
	
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "interested_in")
	private String interested_in;
	@Column(name = "comment")
	private String comment;*/

}

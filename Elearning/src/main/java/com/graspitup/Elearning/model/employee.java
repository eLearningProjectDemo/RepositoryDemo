package com.graspitup.Elearning.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data
public class employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	@Column(name = "first_name") 
	private String first_name;
	@Column(name = "last_name") private String last_name;
    @Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	

	/*
	 * @Column(name = "first_name") private String first_name;
	 * 
	 * @Column(name = "last_name") private String last_name;
	 * 
	 * @Column(name = "job_title") private String job_title;
	 * 
	 * @Column(name = "phone_number") private String phone_number;
	 * 
	 * @Column(name = "interested_in") private String interested_in;
	 * 
	 * @Column(name = "comment") private String comment;
	 */

}

package com.example.OnlineAyurvedaMedicine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 
 * @author Anton Michael Shagay
 *
 */
@Data
@Entity
public class Admin {
	
	@Id
	@Column(name = "Admin_Id")
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adminId;
	
	@Column(name = "password")
	@NotNull
	private String adminPassword;
	

}

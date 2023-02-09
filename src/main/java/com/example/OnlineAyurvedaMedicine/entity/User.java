package com.example.OnlineAyurvedaMedicine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 * 
 * @author Murali Krishna
 *
 */
@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Size(min=6, message="It's a required field")
	private long userId;
	@Size(min=12)
	@NotNull
	private String userName;
	@NotNull
	private String userType;
}

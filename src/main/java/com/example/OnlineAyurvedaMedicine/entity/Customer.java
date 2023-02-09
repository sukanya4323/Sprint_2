package com.example.OnlineAyurvedaMedicine.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 
 * @author Divya Jyothi
 *
 */
@Data
@Entity
@Table(name = "customer")
public class Customer {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="Customer_ID")
	    @NotNull
		private long customerId;
		@Column(nullable=false, length=10)
		private String customerName;
		@NotNull
		private String password;
		@NotNull
		private String orders;
		
		@OneToMany(cascade=CascadeType.ALL)
		@JoinTable(name="Cust_Od")
		private List<Order> od;

}

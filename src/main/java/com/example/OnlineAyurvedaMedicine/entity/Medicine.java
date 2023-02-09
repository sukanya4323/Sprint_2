package com.example.OnlineAyurvedaMedicine.entity;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 * 
 * @author Tentu Sindhu
 *
 */
@Entity
@Data
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Medicine_ID")
	private long medicineId;
	@Size(min=6)
	private String medicineName;
	@NotNull
	private LocalDate expiryDate;
	@NotNull
	private double price;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cat_med")
	private Category cat;

}

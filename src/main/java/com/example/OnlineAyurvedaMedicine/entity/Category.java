package com.example.OnlineAyurvedaMedicine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 
 * @author Devi
 *
 */
@Entity
@Data
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Category_ID")
	@NotNull
	private long categoryId;
	@Column(nullable=false, length=15)
	private String categoryName;

}

package com.example.OnlineAyurvedaMedicine.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.OnlineAyurvedaMedicine.exception.PriceException;
import lombok.Data;

/**
 * 
 * @author Sukanya
 *
 */
@Entity
@Data
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Order_ID")
	private long orderId;
	@Size(min=6, message="It's a reaquired field")
	private LocalDate orderDate ;
	@NotNull
	private LocalDate dispatchDate;
	private String ordersAddress;
	@NotNull
	private double totalPrice;
	public void setTotalPrice(int totalPrice) throws PriceException{
		if(totalPrice<500) {
			throw new PriceException();
		}
		this.totalPrice=totalPrice;
	}
	
}

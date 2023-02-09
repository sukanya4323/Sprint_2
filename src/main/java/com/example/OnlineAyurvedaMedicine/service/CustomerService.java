package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Customer;
import com.example.OnlineAyurvedaMedicine.exception.CustomerAlreadyExistsException;

/**
 * 
 * @author Divya Jyothi
 *
 */
@Service
public interface CustomerService {
	/**
	 * 
	 * @param cust
	 * @return
	 * @throws CustomerAlreadyExistsException
	 */
	Customer saveCustomer(Customer cust) throws CustomerAlreadyExistsException;
	/**
	 * 
	 * @return
	 */
	List<Customer> getAllCustomers();
	/**
	 * 
	 * @param cust
	 * @return
	 */
	Customer saveCustomerEntity(Customer cust);

	/**
	 * 
	 * @param cust
	 * @return
	 */
	Customer updateCustomer(Customer cust);
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	Optional<Customer> getCustomerByCustomerId(long customerId);

	/**
	 * 
	 * @param customerId
	 * @return
	 */
	String deleteCustomerByCustomerId(long customerId);

}

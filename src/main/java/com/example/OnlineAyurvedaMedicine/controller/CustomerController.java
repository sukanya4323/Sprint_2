package com.example.OnlineAyurvedaMedicine.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineAyurvedaMedicine.entity.Customer;
import com.example.OnlineAyurvedaMedicine.exception.CustomerAlreadyExistsException;
import com.example.OnlineAyurvedaMedicine.service.CustomerService;

/**
 * 
 * @author Divya Jyothi
 *
 */
@RestController
public class CustomerController {
	@Autowired
	private  CustomerService custServ;
	@PostMapping("/saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer cust) throws CustomerAlreadyExistsException{
		Customer savedCust = custServ.saveCustomer(cust);
		return new ResponseEntity<>(savedCust, HttpStatus.CREATED);
	}
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/allCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = custServ.getAllCustomers();
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/allCustomer/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable long customerId) {
		Optional<Customer> cust = custServ.getCustomerByCustomerId(customerId);
		return new ResponseEntity<>(cust, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable long customerId) {
		String cust= custServ.deleteCustomerByCustomerId(customerId);
		return new ResponseEntity<>(cust, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param cust
	 * @return
	 */
	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer cust){
		Customer upCust = custServ.updateCustomer(cust);
		return new ResponseEntity<>(upCust, HttpStatus.OK);
		
	}
	

}
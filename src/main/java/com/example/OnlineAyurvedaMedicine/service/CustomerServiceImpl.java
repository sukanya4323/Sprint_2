package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Customer;
import com.example.OnlineAyurvedaMedicine.exception.CustomerAlreadyExistsException;
import com.example.OnlineAyurvedaMedicine.repository.CustomerRepository;

/**
 * 
 * @author Divya Jyothi
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository custRepo;
	/**
	 * 
	 * @param customerRepo
	 */
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		this.custRepo = customerRepo;

	}
	
	@Override
		public Customer saveCustomer(Customer cust) throws CustomerAlreadyExistsException {
		if(custRepo.existsByCustomerName(cust.getCustomerName()))
			throw new CustomerAlreadyExistsException();
		
		return custRepo.save(cust);
		
	}
	
	@Override
	public List<Customer> getAllCustomers(){
		return custRepo.findAll();
	}
	
	@Override
	public Optional<Customer> getCustomerByCustomerId(long customerId) {
		return custRepo.findByCustomerId(customerId);
	}
	
	@Override
	public String deleteCustomerByCustomerId(long customerId) {
		Optional<Customer> cust=custRepo.findById(customerId);
		if(cust.isPresent()) {
			custRepo.deleteById(customerId);
		return "deleted successfully";
		}
		return "id doesn't exists";
	}
	
	@Override
	public Customer updateCustomer(Customer cust) {
		return custRepo.save(cust);
	}

	@Override
	public Customer saveCustomerEntity(Customer cust) {
		return null;
	}


}

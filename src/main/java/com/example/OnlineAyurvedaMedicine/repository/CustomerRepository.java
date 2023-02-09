package com.example.OnlineAyurvedaMedicine.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAyurvedaMedicine.entity.Customer;

/**
 * 
 * @author Divya Jyothi
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

	/**
	 * 
	 * @param customerName
	 * @return
	 */
	boolean existsByCustomerName(String customerName);

	/**
	 * 
	 * @param customerId
	 * @return
	 */
	Optional<Customer> findByCustomerId(long customerId);
	
	

}

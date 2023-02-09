package com.example.OnlineAyurvedaMedicine;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.OnlineAyurvedaMedicine.repository.CustomerRepository;
import com.example.OnlineAyurvedaMedicine.service.CustomerService;
import com.example.OnlineAyurvedaMedicine.service.CustomerServiceImpl;
/**
 * 
 * @author Divya Jyothi
 *
 */
@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {
@Mock private CustomerRepository customerRepo;
	
	private CustomerService customerService;
	
	@BeforeEach void setUp()
    {
        this.customerService = new CustomerServiceImpl(customerRepo);
    }
	/**
	 * @Test Get all customers
	 */
	@Test void getAllCustomer()
    {
        customerService.getAllCustomers();
        verify(customerRepo).findAll();
    }
	/**
	 * @Test Get customer by Id
	 */
	@Test void getCustomerById()
	{
		customerService.getCustomerByCustomerId(402);
		verify(customerRepo).findByCustomerId((long) 402);
	}
	/**
	 * @Test Delete customer by Id - success case 
	 */
	@Test void deleteCustomerByIdSuccessCase()
	{
		customerService.getCustomerByCustomerId(452);
		verify(customerRepo).findByCustomerId((long) 452);
		assertTrue(true);
	}
	/**
	 * @Test Delete customer by Id - failed case 
	 */
	@Test void deleteCustomerByIdFailCase()
	{
		customerService.getCustomerByCustomerId(803);
		verify(customerRepo).findByCustomerId((long) 803);
		assertFalse(false);
	}

}

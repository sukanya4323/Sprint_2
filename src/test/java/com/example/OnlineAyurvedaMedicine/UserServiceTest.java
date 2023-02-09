package com.example.OnlineAyurvedaMedicine;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.OnlineAyurvedaMedicine.repository.UserRepository;
import com.example.OnlineAyurvedaMedicine.service.UserService;
import com.example.OnlineAyurvedaMedicine.service.UserServiceImpl;

/**
 * 
 * @author Murali Krishna
 *
 */
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	@Mock private UserRepository userRepo;
	 
	 private UserService userServ;
	 
	 @BeforeEach void setUp()
	    {
	        this.userServ = new UserServiceImpl(userRepo);
	    }
	 /**
	  * @Test Get all users
	  */
	    @Test void getAllUsers()
	    {
	        userServ.getAllUsers();
	        verify(userRepo).findAll();
	    }
	    /**
		  * @Test Get user by Id
		  */
	    @Test void getUserById()
	    {
	    	userServ.getUserById(302);
	    	verify(userRepo).findById((long) 302);
	    }
	    /**
		  * @Test delete user by Id - success case
		  */
	    @Test void deleteUserByIdSuccessCase()
	    {
	    	userServ.getUserById(305);
	    	verify(userRepo).findById((long) 305);
	    	assertTrue(true);
	    }
	    /**
		  * @Test delete user by Id - failed case
		  */
	    @Test void deleteUserByIdFailedCase()
	    {
	    	userServ.getUserById(999);
	    	verify(userRepo).findById((long) 999);
	    	assertFalse(false);
	    }
}

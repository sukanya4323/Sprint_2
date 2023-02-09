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

import com.example.OnlineAyurvedaMedicine.entity.User;
import com.example.OnlineAyurvedaMedicine.exception.UserAlreadyExistsException;
import com.example.OnlineAyurvedaMedicine.service.UserService;

/**
 * 
 * @author Murali Krishna
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	/**
	 * 
	 * @param user
	 * @return
	 * @throws UserAlreadyExistsException
	 */
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user)throws UserAlreadyExistsException{
	   User savedUser = userServ.saveUser(user);
	   return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/allUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> user = userServ.getAllUsers();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable long userId) {
		Optional<User> user = userServ.getUserById(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User upUser = userServ.updateUser(user);
		return new ResponseEntity<>(upUser, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	@DeleteMapping("/deleteId/{userId}")
	public ResponseEntity <String> deleteById(@PathVariable long userId) {
		String msg = userServ.deleteById(userId);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}

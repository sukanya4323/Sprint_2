package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.User;
import com.example.OnlineAyurvedaMedicine.exception.UserAlreadyExistsException;
import com.example.OnlineAyurvedaMedicine.repository.UserRepository;
/**
 * 
 * @author Murali Krishna
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	/**
	 * 
	 * @param userRepo
	 */
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
		
	}

	@Override
	public User saveUser(User user) throws UserAlreadyExistsException {
		if (userRepo.existsByUserName(user.getUserName()))
			throw new UserAlreadyExistsException();
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	@Override
	public Optional<User> getUserById(long userId) {
		return userRepo.findById(userId);
	}
	
	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	@Override
	public String deleteById(long userId) {
		userRepo.deleteById(userId);
		return "delete successfully";
	}
}

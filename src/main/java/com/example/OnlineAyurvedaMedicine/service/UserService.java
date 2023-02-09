package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;
import com.example.OnlineAyurvedaMedicine.entity.User;
import com.example.OnlineAyurvedaMedicine.exception.UserAlreadyExistsException;
/**
 * 
 * @author Murali Krishna
 *
 */
public interface UserService {
	/**
	 * 
	 * @param user
	 * @return
	 * @throws UserAlreadyExistsException
	 */
	User saveUser(User user) throws UserAlreadyExistsException;
	/**
	 * 
	 * @return
	 */
	List<User> getAllUsers();
	/**
	 * 
	 * @param id
	 * @return
	 */
	Optional<User> getUserById(long id);
	/**
	 * 
	 * @param user
	 * @return
	 */
	User updateUser(User user);
	/**
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(long id);
}

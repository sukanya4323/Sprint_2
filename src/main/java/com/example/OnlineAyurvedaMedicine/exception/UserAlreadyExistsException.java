package com.example.OnlineAyurvedaMedicine.exception;

/**
 * 
 * @author Murali Krishna
 * @throws UserAlreadyExistsException
 */
public class UserAlreadyExistsException extends Exception {
	
	private String msg;
	
	/**
	 * 
	 * @param msg
	 */
	public UserAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
 
	}
	
	public UserAlreadyExistsException() {
		super();
	}


}

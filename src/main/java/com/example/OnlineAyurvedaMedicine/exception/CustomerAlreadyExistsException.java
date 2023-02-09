package com.example.OnlineAyurvedaMedicine.exception;

/**
 * 
 * @author Divya Jyothi
 *
 */
public class CustomerAlreadyExistsException extends Exception {

	private String msg;

	/**
	 * 
	 * @param msg
	 * @throws CustomerAlreadyExistsException
	 */
	public CustomerAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}

	public CustomerAlreadyExistsException() {
		super();
	}

}

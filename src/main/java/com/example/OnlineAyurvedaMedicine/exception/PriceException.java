package com.example.OnlineAyurvedaMedicine.exception;

/**
 * 
 * @author hp
 * @throws PriceException
 */
public class PriceException extends Exception{
	private String msg1;
	public PriceException() {
		super();
	}

	/**
	 * 
	 * @param msg1
	 */
	public PriceException(String msg1) {
		super();
		this.msg1 = msg1;
	}

}

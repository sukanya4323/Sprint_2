package com.example.OnlineAyurvedaMedicine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 
 * @author Sukanya
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * 
	 * @param user1 
	 * @return
	 * @throws Price Exception in Order class
	 */
	@ExceptionHandler(value=PriceException.class)
	public ResponseEntity<String> priceException(PriceException user1){
		return new ResponseEntity<>("Shipping charge of 70/- will be charged. Add more items to make a total of 500/-.", HttpStatus.CONFLICT);
	}
	
	/**
	 * 
	 * @param user 
	 * @throws Existing Customer Exception in Customer class
	 * @return
	 */
	@ExceptionHandler(value = CustomerAlreadyExistsException.class)
	public ResponseEntity<String> customerAlreadyExistsException(CustomerAlreadyExistsException user){
		return new ResponseEntity<>("customer already exists in db. Please- try again", HttpStatus.CONFLICT);
				
	}
	
	/**
	 * 
	 * @param user
	 * @throws Existing User Exception in User class
	 * @return
	 */
	@ExceptionHandler(value = UserAlreadyExistsException.class)
	public ResponseEntity<String> UserAlreadyExistsException (UserAlreadyExistsException user){
		return new ResponseEntity<>("User already exists in database. please try again", HttpStatus.CONFLICT);
	}

}

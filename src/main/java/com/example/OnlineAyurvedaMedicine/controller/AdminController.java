package com.example.OnlineAyurvedaMedicine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.OnlineAyurvedaMedicine.entity.Admin;
import com.example.OnlineAyurvedaMedicine.service.AdminService;

/**
 * 
 * @author Anton Michael Shagay
 *
 */
@RestController
public class AdminController {
	
	@Autowired
	private AdminService adServ;
	
	/**
	 * 
	 * @param ad
	 * @return
	 */
	@PostMapping("/saveAdmin")
	public String save_Admin(@RequestBody Admin ad) {
	    Admin saveAd = adServ.saveAdmin(ad);
		return "Admin saved successfully";

	}
	
	/**
	 * 
	 * @param ad
	 * @return
	 */
	@PostMapping("/loginAdmin")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin ad) {
		Admin savedAd = adServ.saveAdmin(ad);
		return new ResponseEntity<>(savedAd, HttpStatus.CREATED);

	}
}

package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import com.example.OnlineAyurvedaMedicine.entity.Admin;

/**
 * 
 * @author Anton Michael Shagay
 *
 */
public interface AdminService {
	

	/**
	 * 
	 * @param ad
	 * @return
	 */
	 Admin saveAdmin(Admin ad);

	 /**
	  * 
	  * @return
	  */
	List<Admin> getAdmin();

	/**
	 * 
	 * @param ad
	 * @return
	 */
	String loginAdmin(Admin ad);

	

}

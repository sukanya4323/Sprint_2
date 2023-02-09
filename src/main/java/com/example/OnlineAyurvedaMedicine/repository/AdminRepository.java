package com.example.OnlineAyurvedaMedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OnlineAyurvedaMedicine.entity.Admin;

/**
 * 
 * @author Anton Michael Shagay
 *
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	/**
	 * 
	 * @param adminId
	 * @return
	 */
	Admin findByAdminId(long adminId);
	

}

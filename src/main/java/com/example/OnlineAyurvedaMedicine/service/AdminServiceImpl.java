package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OnlineAyurvedaMedicine.entity.Admin;
import com.example.OnlineAyurvedaMedicine.repository.AdminRepository;

/**
 * 
 * @author Anton Michael Shagay
 *
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	@Override
	public Admin saveAdmin(Admin ad) {
		return adminRepo.save(ad);
	}

	@Override
	public List<Admin> getAdmin() {
		return adminRepo.findAll();
	}

	@Override
	public String loginAdmin(Admin ad) {
		Optional<Admin> admin = adminRepo.findById(ad.getAdminId());
		if (admin.isPresent()) {
			if (admin.get().getAdminPassword().equals(ad.getAdminPassword()))
				return "login successful";
		}
		return "try again";
	}

}
package com.LiveWires.LiveWireAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveWires.LiveWireAdmin.model.Admin;
import com.LiveWires.LiveWireAdmin.repository.AdminRepository;

@Service

public class AdminService {

	@Autowired
	
	private AdminRepository adminRepository;
	
	public Admin getAdmin(Admin admin) {
		Admin viewAdmin=adminRepository.save(admin);
		return viewAdmin;
	}
	public Admin createAdmin(Admin admin) {
		Admin savedAdmin=adminRepository.save(admin);
		return savedAdmin;
	}

	
	
}

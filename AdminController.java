package com.LiveWires.LiveWireAdmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LiveWires.LiveWireAdmin.model.Admin;
import com.LiveWires.LiveWireAdmin.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
@Autowired
	
	private AdminService adminService;
	
	@GetMapping("/get")
	public Admin getAdmin(@RequestBody Admin admin) {
		Admin viewAdmin=adminService.getAdmin(admin);
		return viewAdmin;
	}

	@PostMapping("/create")
	public Admin createAdmin(@RequestBody Admin admin) {
		Admin savedAdmin=adminService.createAdmin(admin);
		return savedAdmin;
	}
}

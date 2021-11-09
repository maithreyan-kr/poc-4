package com.mighty.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mighty.dao.AdminDao;
import com.mighty.model.Admin;
import com.mighty.model.AdminLogin;

public class AdminServiceImpl implements AdminService {

	@Autowired
	public AdminDao adminDao;

	public Admin validateAdmin(AdminLogin adminlogin) {
		return adminDao.validateAdmin(adminlogin);
	}

}

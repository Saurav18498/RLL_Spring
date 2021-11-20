package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.AdminDao;
import com.mph.entity.Admin;



@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;
	
	
	@Override
	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}


}

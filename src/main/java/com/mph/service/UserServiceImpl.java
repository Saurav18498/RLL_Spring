package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.UserDao;

import com.mph.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao userDao;
	
	@Override
	public void createUser(User user) {
		userDao.createUser(user);
		
	}

}
package com.mph.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.User;
@Repository
public class UserDaoImpl implements UserDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void createUser(User user) {
		getSession().saveOrUpdate(user);
		System.out.println("User added Successfully :)");
	}

}
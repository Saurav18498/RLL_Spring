package com.mph.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Admin;


@Repository
public class AdminDaoImpl implements AdminDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void addAdmin(Admin admin) {
		getSession().saveOrUpdate(admin);
		System.out.println("admin Stored Successfully :)");
		
	}

}

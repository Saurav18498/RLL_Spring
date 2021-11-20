package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Order;


@Repository
public class OrderDaoImpl implements OrderDao{

	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Order> getOrderList() {
		Query qry = getSession().createQuery("from Order");
		List<Order> orderlist = qry.list();
		return orderlist;
	}
	
	
	
	
	@Override
	public void addOrder(Order order) {
		System.out.println("from dao" +order);
		getSession().saveOrUpdate(order);
		System.out.println("order Stored Successfully :)");
		
	}

	
		
	
	
	
	
	
	
	/*@Override
	public List<Order> updateOrder(Order order) {
		Query qry = getSession().createQuery("update Order set customer_name=:nam,email=:email,order_name=:nam,order_id=:order_no");
		qry.setParameter("nam", order.getCustomer_name());
		qry.setParameter("email", order.getEmail());
		qry.setParameter("nam", order.getOrder_name());
		qry.setParameter("order_no", order.getOrder_id());
		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Update is successful !!!");
		}
		return getOrderList();
	}*/
	
	@Override
	public List<Order> deleteOrder(int order_id) {
		Query qry = getSession().createQuery("delete Order where order_id=:order_no");		
		qry.setParameter("order_no", order_id);		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " + order_id + "successfully !!!");
		}
		return getOrderList();
	}

	
	
	
	@Override
	public Order getOrderById(int order_id) {
		Query query = getSession().createQuery("from Order order where order_id=:order_no");
		query.setParameter("order_no", order_id);
		Order orderlist =(Order) query.uniqueResult();
		System.out.println(orderlist);
		return orderlist; 
	}
	
	
	
	@Override
	public List<Order> searchOrderById(int order_id) {
		Query query = getSession().createQuery("from Order order where order_id=:order_no");
		query.setParameter("order_no", order_id);
		List<Order> orderlist =query.list();
		System.out.print(orderlist);
		return orderlist; 
	}
}
package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.mph.dao.OrderDao;

import com.mph.entity.Order;


@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao orderDao;
	

	
	@Override
	public List<Order> getOrderList() {
		
		return orderDao.getOrderList();
	}
	
	
	
	@Override
	public void addOrder(Order order) {
		System.out.println("from service" +order);
		orderDao.addOrder(order);
	}



	
	
	
	
	/*@Override
	public List<Order> updateOrder(Order order) {
		
		return orderDao.updateOrder(order);
	}*/

	
	@Override
	public List<Order> deleteOrder(int order_id) {
		
		return orderDao.deleteOrder(order_id);
	}
	
	
	@Override
	public Order getOrderById(int order_id){
		
		return orderDao.getOrderById(order_id);
	}
	
	
	
	@Override
	public List<Order> searchOrderById(int order_id) {
		
		return orderDao.searchOrderById(order_id);
	}
}



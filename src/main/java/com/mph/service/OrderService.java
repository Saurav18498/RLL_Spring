package com.mph.service;


import java.util.List;

import com.mph.entity.Order;


public interface OrderService{
	
	public void addOrder(Order order);
	public List<Order> deleteOrder(int order_id);
	public List<Order> getOrderList();
	public Order getOrderById(int order_id);
	List<Order> searchOrderById(int order_id);
	//public List<Order> updateOrder(Order order);
	

}
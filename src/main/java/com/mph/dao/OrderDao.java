package com.mph.dao;


import java.util.List;


import com.mph.entity.Order;


public interface OrderDao {

	public void addOrder(Order order);
	public List<Order> getOrderList();
	public List<Order> deleteOrder(int order_id);
	Order getOrderById(int order_id);
	List<Order> searchOrderById(int order_id);
	//List<Order> updateOrder(Order order); 
	
}
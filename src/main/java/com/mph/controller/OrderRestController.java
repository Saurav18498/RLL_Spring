package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mph.entity.Order;
import com.mph.service.OrderService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;









@RestController
@EnableWebMvc
@EnableSwagger2
@RequestMapping(value="/canteen")
@CrossOrigin(origins = "*" ,methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "false",allowedHeaders = "*")

public class OrderRestController {

	@Autowired
	OrderService orderService;
	
	
	
	

	@GetMapping("/allOrder")
	public ResponseEntity<List<Order>> allOrder() {
		List<Order> olist = orderService.getOrderList();
		System.out.println(olist);
		if (olist.isEmpty()) {
			return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Order>>(olist, HttpStatus.OK);
	}
	
	
	@PostMapping("/createOrder")
	public Order addOrder(@RequestBody Order order)
	{
		System.out.println("from controller" +order);
		orderService.addOrder(order);
		return order;
	}
	
	
	/*@PutMapping("/updateOrder")
	public ResponseEntity<List<Order>> updateOrder(@RequestBody Order order) {
		System.out.println("Update Rest () " + order);
		List<Order> uolist = orderService.updateOrder(order);
		System.out.println(uolist);
		if (uolist.isEmpty()) {
			return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Order>>(uolist, HttpStatus.OK);
	}
	*/
	
	
	
	@DeleteMapping("/deleteOrder/{id}")
	public ResponseEntity<List<Order>> deleteOrder(@PathVariable("id") int order_id) {
		List<Order> delist = orderService.deleteOrder(order_id);
		System.out.println(delist);
		if (delist.isEmpty()) {
			return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Order>>(delist, HttpStatus.OK);
	}
	
	
	@GetMapping("/getOrder/{id}")
		public ResponseEntity<Order> getOrderById(@PathVariable("id") int order_id) {
		Order order = orderService.getOrderById(order_id);
		if (order == null) {
			return new ResponseEntity<Order>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
}
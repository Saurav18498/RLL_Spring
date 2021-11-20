package com.mph.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mph.entity.Payment;
import com.mph.service.PaymentService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping(value="/canteen")
@CrossOrigin(origins = "*" ,methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "false",allowedHeaders = "*")


public class PaymnentRestController {
	@Autowired
	PaymentService paymentService;
	
	
	
	@GetMapping("/allPayment")
	public ResponseEntity<List<Payment>> allPayment()
	{
		
		List<Payment> plist=paymentService.getPaymentList();
		System.out.println(plist);
		if(plist.isEmpty())
		{
			return new ResponseEntity<List<Payment>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Payment>>(plist,HttpStatus.OK);
	}
	
	@DeleteMapping("/removePayment/{id}")
	public ResponseEntity<List<Payment>> removePayment(@PathVariable("id") int payment_id) {
		List<Payment> delist = paymentService.removePayment(payment_id);
		System.out.println(delist);
		if (delist.isEmpty()) {
			return new ResponseEntity<List<Payment>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Payment>>(delist, HttpStatus.OK);
	}
	
	
}

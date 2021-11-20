package com.mph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.User;
import com.mph.service.UserService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@EnableSwagger2
@RequestMapping(value = "/registration")
@CrossOrigin(origins = "*" ,methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "false",allowedHeaders = "*")
public class UserRestController {
	@Autowired
	UserService userService;
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user)
	{
		userService.createUser(user);
		return user;
	}
}

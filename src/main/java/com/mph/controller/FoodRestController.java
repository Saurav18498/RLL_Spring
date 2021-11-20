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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mph.entity.Food;
import com.mph.service.FoodService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping(value = "/food")
@CrossOrigin(origins = "*" ,methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "false",allowedHeaders = "*")

public class FoodRestController {
	@Autowired
	FoodService foodService;
	
	@GetMapping("/allfood")
	public ResponseEntity<List<Food>> allFood()
	{
		
		List<Food> flist=foodService.getFoodList();
		System.out.println(flist);
		if(flist.isEmpty())
		{
			return new ResponseEntity<List<Food>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Food>>(flist,HttpStatus.OK);
	}
	
	@PostMapping("/addFood")
	public Food addFood(@RequestBody Food food)
	{
		foodService.addFood(food);
		return food;
	}
	@DeleteMapping("/removeFood/{id}")
	public ResponseEntity<List<Food>> removeFood(@PathVariable("id") int f_id)
	{
		List<Food> dflist=foodService.removeFood(f_id);
		System.out.println(dflist);
		if(dflist.isEmpty())
		{
			return new ResponseEntity<List<Food>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Food>>(dflist,HttpStatus.OK);
	}
}

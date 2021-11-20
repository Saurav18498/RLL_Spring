package com.mph.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.FoodDao;
import com.mph.entity.Food;

@Service
@Transactional
public class FoodServiceImpl implements FoodService {
	@Autowired
	FoodDao foodDao;
	
	@Override
	public List<Food> getFoodList() {
		return foodDao.getFoodList();
	}
	@Override
	public void addFood(Food food) {
		foodDao.addFood(food);
		
	}

	@Override
	public List<Food> removeFood(int f_id) {
		return foodDao.removeFood(f_id);
	}

}

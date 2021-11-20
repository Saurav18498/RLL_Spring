package com.mph.dao;

import java.util.List;

import com.mph.entity.Food;

public interface FoodDao {
	public List<Food> getFoodList();
	public void addFood(Food food);
	public List<Food> removeFood(int f_id);
	
}

package com.mph.service;



import java.util.List;

import com.mph.entity.Food;

public interface FoodService {
	public List<Food> getFoodList();
	public void addFood(Food food);
	public List<Food> removeFood(int f_id);
}

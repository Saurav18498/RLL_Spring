package com.mph.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Food;
@Repository
public class FoodDaoImpl implements FoodDao{
	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Food> getFoodList() {
		Query qry = getSession().createQuery("from Food");
		List<Food> foolist = qry.list();
		return foolist;
	}
	@Override
	public void addFood(Food food) {
		getSession().saveOrUpdate(food);
		System.out.println("Food added Successfully :)");
		
	}


	@Override
	public List<Food> removeFood(int f_id) {
		Query qry = getSession().createQuery("delete Food where f_id=:fno");		
		qry.setParameter("fno", f_id);		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " + f_id + "successfully !!!");
		}
		return getFoodList();
	}	

}
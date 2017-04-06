package com.practice.food.factory;


public class FoodFactory {

	public FoodFactory() {
		// TODO Auto-generated constructor stub
	}
	public Food getFood(String food)
	{
		if (food.equalsIgnoreCase("FASTFOOD"))
		{
			return new FastFood("FASTFOOD");
		}
		else if (food.equalsIgnoreCase("Fruit"))
		{
			return new Fruit("Fruit");
		}
		return null;
	}


}

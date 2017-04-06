package com.practice.food.factory;

public class FoodfactoryExample {

	public static void main(String[] args) {
		FoodFactory myFoods =new FoodFactory();
		Food food1 = myFoods.getFood("FastFood");
		Food food2 = myFoods.getFood("Fruit");
		System.out.println("My name is: "+food1.getClass().getName());
		System.out.println("My name is: "+food2.getClass().getName());
		System.out.println("Our Super class is : " + food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();
		
	}
	
		
}
package com.practice.food.factory;

public class StairCase {

	public static void main(String[] args) {
		int n=6;
		for (int index=0; index< n; index++)
		{
			for(int space= n-index-1; space>0; space--)
			{
				System.out.print(" ");
			}
			for(int hash=0; hash<=index; hash++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}
	}


}

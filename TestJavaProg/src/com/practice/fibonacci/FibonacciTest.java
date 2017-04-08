package com.practice.fibonacci;

public class FibonacciTest {

	
	public static void main(String[] args) {
		System.out.println("\nFibonacci with out recursion");
		fibonacci();
		
		System.out.println("\nFibonacci with recursion\n");
		
		System.out.print(0 + " "+ 1);
		FibonacciRecursion recursion = new FibonacciRecursion();
		recursion.fibonacciWithRecursion(10);
	}
	public static void fibonacci()
	{
		int n1=0, n2 =1, n3,i, count =10;
		System.out.println();
		System.out.print(n1+ " "+ n2);
		for(i=0;i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
			
		}

	}
	
	}

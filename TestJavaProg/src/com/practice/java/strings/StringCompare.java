package com.practice.java.strings;

public class StringCompare {
	public static void main(String args[])
	{
		String a="Test";
		String b="Test";
		String x= new String("Test");
		String y= new String("Test");
		if (a==b)
		{
			System.out.println("a and b are matching");
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
			System.out.println(x.hashCode());
			System.out.println(y.hashCode());
		}
		if(a.equals(b))
		{
			System.out.println("Matching");
		}
		if(x==y)
		{
			System.out.println("X and Y are matching");
		}
		else
		{
			System.out.println("X and Y are NOT matching");
		}
		if (a==x)
		{
			System.out.println("a and x are matching");
		}
		else
		{
			System.out.println("a and x are NOT matching");
		}
		if (b==x)
		{
			System.out.println("b and x are matching");
		}else
		{
			System.out.println("b and x are NOT matching");
		}
	}
}

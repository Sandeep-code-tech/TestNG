package com.testng;

import org.testng.annotations.Test;

public class Demotestng {

	
	@Test
	public void print()
	{
		System.out.println("hello world");
		}
	
	@Test
	public void add()
	{
		sum(50,60);
		
}
	public void sum(int a, int b)
	{ 
		int sum=0;
		sum= a + b;
		System.out.println("sum="+sum);	
	}
}


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
		sum(50,60,90,100);
		
}
	public void add2()
	{
		sum(50,60,90,100);
		
}
	@Test
	void show1()
	{
		System.oout.println("Hi");
	}
	
	
	
	@Test
	public void add()
	{
		sum(50,60, 70);
	public void sum(int a, int b)
	{ 
		int sum=0;
		sum= a + b;
		System.out.println("sum="+sum);	
	}
}


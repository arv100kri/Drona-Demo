package com.drona.service;

public class CalculatorService 
{
	private double add(double a, double b)
	{
		return a+b;
	}
	private double subtract(double a, double b)
	{
		return a-b;
	}
	private double multiply(double a, double b)
	{
		return a*b;
	}
	private double divide(double a, double b)
	{
		return a/b;
	}
	
	public double calculateOperation(int choice, double a, double b)
	{
		double c=0;
		switch(choice)
		{
			case 1: c=add(a,b);
					break;
			case 2: c=subtract(a,b);
					break;
					
			case 3: c=multiply(a,b);
					break;
			
			case 4: c=divide(a,b);
					break;
		}
		return c;
	}
	
}


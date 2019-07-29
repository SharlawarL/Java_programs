package com.bridgelabz.algorithm;

public class Temperature_convertion {
	
	public static void main(String[] args) {
		double F = Double.parseDouble(args[0]);
		
		convert(F);
	}
	static void convert(double F)
	{
		double C;
		
		System.out.println("The temperature in Fahrenheit is "+F);	
		
		C =((F-32)*5)/9;
				
		System.out.println("The temperature in Celsius is "+C);	
		
		F = (C*9)/5 + 32;
		
		System.out.println("The temperature in Fahrenheit is "+F);	

		
		
	}

}

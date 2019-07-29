package com.bridgelabz.functional;
import java.util.Scanner;

public class Quatratic {
	
	public static void main(String[] args) {
		Scanner lalit=new Scanner(System.in);
		
		System.out.print("Enter the value A :");
		double a=lalit.nextInt();
		
		System.out.print("Enter the value B :");
		double b=lalit.nextInt();
		
		System.out.print("Enter the value c :");
		double c=lalit.nextInt();
				
		double delta = b*b - 4*a*c;
		
		if(delta>0) {
			double root1= (-b + Math.sqrt(delta))/(2*a);
			double root2= (-b - Math.sqrt(delta))/(2*a);
			
			System.out.print("The Quadratic root of "+root1+" and "+root2);
		}else if(delta == 0)
		{
			double root= (-b )/(2*a);
			System.out.print("The Quadratic root of "+root);
		}else {
			System.out.print("The Quadratic equation has no real root");
		}
		
		lalit.close();
				
	}
	
	

}

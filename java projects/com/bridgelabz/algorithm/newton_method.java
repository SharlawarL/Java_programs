package com.bridgelabz.algorithm;
import java.util.Scanner;

public class newton_method {
	
	public static void main(String[] args) {
		
		Scanner lalit = new Scanner(System.in);
		
		System.out.print("Enter the c value :");
		
		double c = lalit.nextDouble();
		
		double epsilon = 1e-15;
		
		double t=c;
		
		newton(c,t,epsilon);
		
		lalit.close();
		
		
	}
	
	static void newton(double c,double t, double epsilon) {
		while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
		
		System.out.println("The SquarRoot by Newton method is : "+t);
	}

}

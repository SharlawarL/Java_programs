package com.bridgelabz.algorithm;

public class MonthlyPayment {
	
	public static void main(String[] args) {
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		
		pay_calc(P,Y,R);
		
		
		
	}
	
	static void pay_calc(double P,double Y,double R) {
		double payment;
		
		double n= 12*Y;
		
		double r = R/(12*100);
		
		payment = (P*r)/(1-Math.pow((1+r),-n));
		
		System.out.print("The payment is "+payment);
		
	}

}

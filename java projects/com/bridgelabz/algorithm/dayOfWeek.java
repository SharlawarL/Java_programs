package com.bridgelabz.algorithm;

public class dayOfWeek {
	public static void main(String[] args){
		int D = Integer.parseInt(args[0]);
		int M = Integer.parseInt(args[1]);
		int Y = Integer.parseInt(args[2]);
		
		
		calender(D,M,Y);
		
	}
	
	static void calender(int D,int M,int Y) {
		
		int D1, M1, Y1, X;
		
		Y1 = Y -(14-M)/12;
		
		X = Y1 + Y1/4 - Y1/100 + Y1/400;
		
		M1 = M + 12*((14-M)/12)-2;
		
		D1= ( D + X + 31*M/12)% 7+1;
		
		
		System.out.println("Date : "+D1+" Month :"+M1+" Year : "+Y1);
		
		System.out.println("");
		
		if(D1 == 0)
			System.out.println("Sunday");
		if(D1 == 1)
			System.out.println("Monday");
		if(D1 == 2)
			System.out.println("Tuesday");
		if(D1 == 3)
			System.out.println("Wednesday");
		if(D1 == 4)
			System.out.println("Thursday");
		if(D1 == 5)
			System.out.println("Friday");
		if(D1 == 6)
			System.out.println("Saturday");
	}

}

package com.bridgelabz.functional;
import java.util.Scanner;

public class power_of_two {
	public static void main(String[] args) {
		Scanner lalit = new Scanner(System.in);
		
		int power = Integer.parseInt(args[0]);

		int root = 1;
		
		//Only works if 0 <= N < 31 since 2^31 overflows an int
		if(power< 31)
		{
		
		for(int i=1;i<=power;i++)
		{
			root = root*2;
			System.out.println("The 2^"+i+" is "+root);
		}
		
		System.out.print("The power of N value is :"+root);
		
		}else
			System.out.print("Please Enter 0<=N<=31 ");
		
		lalit.close();
	}

}

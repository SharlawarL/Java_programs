package com.bridgelabz.functional;
import java.util.Scanner;

public class factor {
	public static void main(String[] args)
	{
		Scanner lalit = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = lalit.nextInt();
		
		for(int i=2;i<number;i++)
		{
			while(number%i == 0)
			{
				System.out.println(i+" ");
				number = number/i;
			}
		}
		if(number>2) 
			System.out.print(number);
		
		lalit.close();
		
	}
}

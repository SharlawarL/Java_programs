package com.bridgelabz.algorithm;
import java.util.Scanner;

public class Quetion {
	
	public static void main(String[] args)
	{
		Scanner lalit=new Scanner(System.in);
		
		int A = Integer.parseInt(args[0]);
		
		int n= (int)Math.pow(2,A);
		
		System.out.println("Think the value between the 0 to "+(n-1)+"  :");
		System.out.println("");
		
		int result = search_number(0,n);
		
		System.out.print("Your value is "+result);
		lalit.close();
		
	}
	static int search_number(int low,int high) {
		Scanner lalit=new Scanner(System.in);
		
		if((high - low) == 1)
			return low;
		
		int mid = low + (high - low)/2;
		
		System.out.println("It is less than "+mid+" Then enter 1 otherwise 0 ");
		int check = lalit.nextInt();
		
		
		if(check == 1)
			return search_number(low,mid);
		else
			return search_number(mid,high);
		
		
	}

}

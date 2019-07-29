package com.bridgelabz.algorithm;
import java.util.Scanner;
import java.lang.Math;

public class toBinery {
	
	public static void main(String[] args) {
		Scanner lalit = new Scanner(System.in);
		
		System.out.println("Enter The Integer number :");
		int N = lalit.nextInt();
		
		String list = Integer.toBinaryString(N);
		
		int len = list.length();
		
		char[] arr = list.toCharArray();
		
		
		System.out.println("The convertion is to binary :"+list);
		
		System.out.println(" ");
		
		System.out.print(N+" = ");
		int k=0;
		for(int i=len-1;i>=0;i--)
		{
			if(arr[k] != '0')
				System.out.print(Math.pow(2,i)+" + ");
			else
				System.out.print("0 + ");
			
			k++;
		}
		lalit.close();
	}

}

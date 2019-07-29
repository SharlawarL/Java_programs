package com.bridgelabz.algorithm;
import java.util.Scanner;
import java.lang.Math;

public class toBinery_SwapNibble {
	public static void main(String[] args) {
		Scanner lalit = new Scanner(System.in);
		
		char[] bit=new char[8];
		
		System.out.println("Enter The Integer number :");
		int N = lalit.nextInt();
		
		String list = Integer.toBinaryString(N);
		
		int len = list.length();
		
		String st = "";
		
		if(len < 8)
		{
			for(int i=0;i<8-len;i++)
				st = st+"0";
		

		String list1 = st+list;
		
		int len1 = list1.length();
		
		bit = list1.toCharArray();
		
		
		System.out.println("The convertion is to binary :"+list1);

		
		
		
		
		int k=0;
		for(int i=len1-1;i>=0;i--)
		{
			if(bit[k] != '0')
				System.out.print(Math.pow(2,i)+" + ");
			else
				System.out.print("0 + ");
			
			k++;
		}
		
		System.out.print(" = "+N);
		
		char[] nib1= new char[8];
		
		int c=0;
		for(int n1=4;n1<8;n1++)
		{
			nib1[n1] = bit[c];
			c++;
		}
		for(int n1=0;n1<4;n1++)
		{
			nib1[n1] = bit[c];
			c++;
		}
		System.out.println("");

		
		System.out.println("");
		k=0;
		int number2=0;
		for(int i=len1-1;i>=0;i--)
		{
			if(nib1[k] != '0')
			{
				System.out.print(Math.pow(2,i)+" + ");
				number2=number2+ (int)(Math.pow(2,i));
			}
			else
				System.out.print("0 + ");
			
			k++;
		}
		System.out.println(" = "+number2);
		
		}else {
			System.out.print("Invalid input...");
		}
		
		lalit.close();
	}
}

package com.bridgelabz.algorithm;
import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner lalit = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		int N = lalit.nextInt();
		
		int[] prime =new int[N];
		
		int l=0;
		
		for(int i=1;i<=N;i++)
		{
			int count = 0;
			for(int k=i;k>=1;k--) 
			{
				if(i%k== 0)
				{
					count++;
					
				}
			}
			if(count == 2)
			{
				prime[l] = i;
				l++;
			}
		}
		
		for(int x=0;x<l;x++)
			System.out.println(prime[x]+" ");
		
		lalit.close();
	}
}

package com.bridgelabz.algorithm;
import java.util.Scanner;

public class prime_pallindrone_anagram {
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
			
			
			System.out.println("The prime number are :");
			for(int x=0;x<l;x++)
				System.out.print(prime[x]+" ");
			System.out.println("");
			System.out.println("The palindrome number are :");
			for(int x=0;x<l;x++)
			{
				int a = prime[x];

				int temp = a,pal=0,r;
				
				while(a>0) {
					r=a%10;
					
					pal = (pal*10) + r;
					
					a=a/10;
				}
				if(temp == pal)
					System.out.println("The "+pal+" number is palidrome");
				
			}
			
			lalit.close();
			
			
		}
	}


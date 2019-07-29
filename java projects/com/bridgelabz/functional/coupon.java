package com.bridgelabz.functional;
import java.util.Scanner;
import java.util.Random;

public class coupon {
	
	public static void main(String[] args)
	{
		Scanner lalit = new Scanner(System.in);
	
		System.out.println("");
		
		System.out.print("Enter The range 0 to ");
		int range = lalit.nextInt();
		
		System.out.print("Enter The find value :");
		int n = lalit.nextInt();
		
		if(n>range) {
			System.out.print("Please Enter less than "+range+" and try again");
		}else {
		
		int count=0, ch[] = new int[range], check=1;
		
		int fcoupon = 0,c=0;
		
		while(c<range)
		{
			
			int collected = collect(n,range);
			for(int k=0;k<range;k++)
			{
				if(ch[k] == collected)
				{
					check = 0;			
				}
			}	
			
			if(check != 0)
			{
				System.out.print(collected+" ");
				ch[count] = collected;
				count++;
				fcoupon++;
				c++;
				
			}
			if(collected == n) {
				System.out.print(collected+" ");
				fcoupon++;
				System.out.println(" ");
				System.out.println("Value is find at "+fcoupon);
				break;
			}
		
		}
		
		lalit.close();
		}
	
	}

	
	static int collect(int n,int range)
	{
		Random rand = new Random();
		
		int ramdom_number = rand.nextInt(range);
	
		return ramdom_number;
	}
	

}

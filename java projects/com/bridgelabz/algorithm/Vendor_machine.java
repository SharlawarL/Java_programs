package com.bridgelabz.algorithm;
import java.util.Scanner;

public class Vendor_machine {
	public static void main(String[] args) {
		int note[] = {1000,500,100,50,10,5,2,1};
		
		Scanner lalit = new Scanner(System.in);
		
		System.out.print("Change to be return :");
		int change = lalit.nextInt();
		
		for(int i=0;i<note.length;i++) {
			int count=0;
			
			while(change>=note[i])
			{
				change = change -note[i];
				count++;
			}
			
			System.out.println("The "+note[i]+"-note    :"+count+"*"+note[i]+" = "+count*note[i]);
		}
		
		lalit.close();
	}
}

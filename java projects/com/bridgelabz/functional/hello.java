package com.bridgelabz.functional;
import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner lalit = new Scanner(System.in);
	
		System.out.print("\n Enter User Name");
		String username = lalit.nextLine();
		
		int text_length = username.length();
		
		if(text_length > 3)
		{
			System.out.print("Hello "+username+", How are you");
		}else {
			System.out.print("Please Enter Minimun 3 charecter..");
		}
		
		lalit.close();
	}
}

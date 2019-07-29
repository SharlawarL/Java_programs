package com.bridgelabz.functional;
import java.util.Scanner;

public class leap_year {
	public static void main(String[] args) {
		
	Scanner lalit= new Scanner(System.in);
	
	System.out.print("Enter Year :");
	
	int year= lalit.nextInt();
	boolean leap= false;
	
	String lnght = Integer.toString(year);
	if(lnght.length() == 4) {
		if( year%4 == 0) {
			if(year%100 == 0)
			{
				if(year%400 == 0)
				{
					leap= true;
				}else {
					leap= false;
				}
			}else {
				leap= true;
			}
		
		}else {
			leap= false;
		}
	
		if(leap == true)
			System.out.print(year+" This is the leap Year");
		else
			System.out.print(year+" This is not leap Year");
	}
	else
		System.out.print("Please Enter 4-digit year and try again...");
	
	lalit.close();

	}
}

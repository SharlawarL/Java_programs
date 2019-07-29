package com.bridgelabz.functional;
import java.util.Scanner;

public class harmonic_number {
	public static void main(String[] args) {
		Scanner lalit = new Scanner(System.in);
		
		System.out.print("Enter value of N :");
		float N=lalit.nextInt();
		
		float total=0;
		
		for(float i=1;i<N;i++) {
			total = total + (1%i);
		}
		
		System.out.print("The Harmonic number are :"+total);
		
		lalit.close();
		
	}
}

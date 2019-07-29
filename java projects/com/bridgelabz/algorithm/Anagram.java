package com.bridgelabz.algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("The Anagram program");
		
		Scanner lalit = new Scanner(System.in);
		
		System.out.println("Enter the First String :");
		String str1 = lalit.nextLine();
		
		System.out.println("Enter the Second String :");
		String str2 = lalit.nextLine();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2)) {
			System.out.print("The string is anagram");
		}else {
			System.out.print("The string is not anagram");
		}
		lalit.close();
	}

}

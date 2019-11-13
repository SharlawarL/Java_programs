/*
 *An Anagram Detection Example
 *Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
 *I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
 *O/P -> The Two Strings are Anagram or not....
 *Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
 *Extend the above program to find the prime numbers that are Anagram and Palindrome 
 */

package com.bridgelabz.algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("The Anagram program");
		//scanner object for getting input from user
		Scanner lalit = new Scanner(System.in);
		
		//take first string inout from user
		System.out.println("Enter the First String :");
		String str1 = lalit.nextLine();
		
		//take Second string input from user
		System.out.println("Enter the Second String :");
		String str2 = lalit.nextLine();
		
		//convert array to the given string
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//generate output
		if(Arrays.equals(ch1,ch2)) {
			System.out.print("The string is anagram");
		}else {
			System.out.print("The string is not anagram");
		}
		lalit.close();
	}

}

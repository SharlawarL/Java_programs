package com.bridgelabz.functional;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class permatation {
	public static void main(String[] args) {
		Scanner lalit= new Scanner(System.in);
		
		
		System.out.print("Enter The string :");
		String str = lalit.nextLine();
		
		String i_str = str;
		
		System.out.println("Recursion Method :");
		r_parmutation(str,"");
		
		List<String> list = new ArrayList<>();
		
		System.out.println("");
		System.out.println("Iteration Method :");
		
		//Iteration
		
		list.add(String.valueOf(str.charAt(0)));
		int i_count=1;

		for (int i = 1; i < str.length(); i++)
		{
			for (int j = list.size() - 1; j >= 0 ; j--)
			{
				
				String str1 = list.remove(j);

				for (int k = 0; k <= str1.length(); k++)
				{
					
					list.add(str1.substring(0, k) + str.charAt(i) +
								str1.substring(k));
					
				}
			}
			
			
		}
		
		System.out.println(list);
		
		System.out.print(list.size());
		
		lalit.close();
		
	}
	
	//recursion method

	static void r_parmutation(String str, String generated_string) {
		
		if(str.length() == 0) {
			System.out.print(generated_string+" ");
			
		}
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			String str2 = str.substring(0,i)+str.substring(i+1);
			
			
			r_parmutation(str2, generated_string+ch);
		}
		
		
	}
}

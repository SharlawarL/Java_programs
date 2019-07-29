package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class binary_w_w 
{
	public static void main(String[] args) throws Exception
	{
		Scanner lalit=new Scanner(System.in);
		File f=new File("/home/admin1/eclipse-workspace/hello/src/bridgelabz/algorithm/lalit.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String s;
		String list[] = null;
		while((s=br.readLine()) != null)
		{
			list=s.split(",");
		}

		Arrays.sort(list);

		for(int i=0;i<list.length;i++)
			System.out.println(list[i]+" ");

		System.out.print("Enter the search value :");
		String N = lalit.nextLine();

		int start = 0;
		int end = list.length;

		int result = utility.binarySearch_w(list,start,end-1,N);

		int result1= result-1;

		if(result == -1) {
			System.out.print("Element not found");
		}else {
			System.out.print("Element "+list[result1]+" is find at "+result1);
		}
		br.close();
		lalit.close();
	}

}
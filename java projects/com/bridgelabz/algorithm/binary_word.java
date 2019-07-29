package com.bridgelabz.algorithm;
import java.util.Scanner;

public class binary_word {
	public static void main(String[] args) {
		String list[] = {"aaa","bbb","ccc","ddd","eee","fff"};
		
		Scanner lalit= new Scanner(System.in);
		
		System.out.print("Enter the search value :");
		String N = lalit.nextLine();
		
		int start = 0;
		int end = list.length;
		
		int result = binarySearch(list,start,end-1,N);
		
		int result1= result-1;
		
		if(result == -1) {
			System.out.print("Element not found");
		}else {
			System.out.print("Element "+list[result1]+" is find at "+result1);
		}
		lalit.close();
	}

	static int binarySearch(String list[],int start,int end,String N) {
	
		if(end >= start) {
			int mid = start + (end-start)/2;

			if(list[mid].compareTo(N) == 1)
				return mid;
			else if(list[mid].compareTo(N)>0)
				return binarySearch(list,start,end-1,N);
			else
				return binarySearch(list,start,end+1,N);
		}else
			return -1;
	
	
	}
}

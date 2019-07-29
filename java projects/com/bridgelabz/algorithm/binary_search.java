package com.bridgelabz.algorithm;
import java.util.Scanner;

public class binary_search {
	public static void main(String[] args) {
		int list[] = {0,1,2,3,4,5,6,7,8,9,10};
		
		Scanner lalit= new Scanner(System.in);
		
		System.out.print("Enter the search value :");
		int N = lalit.nextInt();
		
		int start = 0;
		int end = list.length;
		
		int result = binarySearch(list,start,end-1,N);
		
		if(result == -1) {
			System.out.print("Elelment not found");
		}else {
			System.out.print("Element find at "+result);
		}
		lalit.close();
	}

	static int binarySearch(int list[],int start,int end,int N) {
	
		if(end >= start) {
			int mid = start + (end-start)/2;
			
			if(list[mid] == N)
				return mid;
			else if(list[mid]>N)
				return binarySearch(list,start,end-1,N);
			else
				return binarySearch(list,start,end+1,N);
		}else
			return -1;
	
	
	}
}

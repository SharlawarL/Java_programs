package com.bridgelabz.algorithm;
import java.util.Scanner;

public class bubble_sort {
	
	public static void main(String[] args) {
Scanner lalit=new Scanner(System.in);
		
		System.out.print("Enter Length of list :");
		int NL= lalit.nextInt();
		
		int list[] = new int[NL];
		
		System.out.print("Enter Tyhe Elements For bubble Sort :");
		
		for(int i=0;i<NL;i++)
			list[i] = lalit.nextInt();
		
		int N = list.length;
	
		bubble(list,N);
	
		lalit.close();
		
	}
	
	static void bubble(int list[],int N)
	{
		for(int i=0;i<N-1;i++) {
			
			for(int j=0;j<N-i-1;j++)
			{
				if(list[j]>list[j+1])
				{
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted list is :");
		
		for(int i=0;i<N;i++) {
			System.out.print(list[i]+" ");
			
		}
	}
}

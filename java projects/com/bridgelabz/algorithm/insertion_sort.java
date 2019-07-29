package com.bridgelabz.algorithm;
import java.util.Scanner;

public class insertion_sort {
	
	public static void main(String[] args) {
		
		
		
		Scanner lalit=new Scanner(System.in);
		
		System.out.print("Enter Length of list :");
		int NL= lalit.nextInt();
		
		int list[] = new int[NL];
		
		System.out.print("Enter The Elements For Insertion Sort :");
		
		for(int i=0;i<NL;i++)
			list[i] = lalit.nextInt();
		
		int N = list.length;
	
		insertion(list,N);
	
		lalit.close();
	
	}
	
	static void insertion(int list[],int N) {
		for(int i=0;i<N;i++) {
			int prev = list[i];
			int j=i-1;
			
			while(j>=0 && list[j]>prev) {
				list[j+1]= list[j];
				j=j-1;
			}
			list[j+1]=prev;
		}
		
		System.out.println("Sorted list is :");
		
		for(int i=0;i<N;i++) {
			System.out.print(list[i]+" ");
			
		}
		
	}

}

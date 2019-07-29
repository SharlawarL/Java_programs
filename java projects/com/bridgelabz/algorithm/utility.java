package com.bridgelabz.algorithm;

public class utility {
	// for binary Integer
	
	static int binarySearch_i(int list[],int start,int end,int N) {
		
		if(end >= start) {
			int mid = start + (end-start)/2;
			
			if(list[mid] == N)
				return mid;
			else if(list[mid]>N)
				return binarySearch_i(list,start,end-1,N);
			else
				return binarySearch_i(list,start,end+1,N);
		}else
			return -1;
	
	
	}
	
	// For binary word
	
	static int binarySearch_w(String[] list,int start,int end,String N) {
		
		if(end >= start) {
			int mid = start + (end-start)/2;

			if(list[mid].compareTo(N) == 1)
				return mid;
			else if(list[mid].compareTo(N)>0)
				return binarySearch_w(list,start,end-1,N);
			else
				return binarySearch_w(list,start,end+1,N);
		}else
			return -1;
	
	
	}
	
	//insertion for integer
	
	static void insertion_i(int list[],int N) {
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
	
	
	// insertion for word
	
	static void insertion(String list[],int N) {
		for(int i=0;i<N;i++) {
			String prev = list[i];
			int j=i-1;
			
			while(j>=0 && list[j].compareTo(prev) > 0) {
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
	
	// bobble sort for integer
	
	
	static void bubble_i(int list[],int N)
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
	
	// bobble sort word
	
	
	static void bubble_w(String list[],int N)
	{
		for(int i=0;i<N-1;i++) {
			
			for(int j=0;j<N-i-1;j++)
			{
				if(list[j].compareTo(list[j+1]) < 0)
				{
					String temp = list[j];
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

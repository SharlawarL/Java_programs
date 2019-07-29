package com.bridgelabz.functional;
import java.util.Scanner;

public class triplets {
	public static void main(String[] args)
	{
		Scanner lalit=new Scanner(System.in);
		int arr[] = new int[50];
		
		System.out.print("Enter the N value :");
		int N= lalit.nextInt();
		
		
		System.out.print("Enter The integers :");
		for(int i=0; i< N;i++)
		{
			arr[i]=lalit.nextInt();
		}
		
		for(int i=0;i<N-2; i++)
			for(int j=0;j<N-1;j++)
				for(int k=0;k<N;k++)
				{
					if(arr[i] + arr[j] +arr[k] ==0) {
						System.out.println(arr[i]+" "+ arr[j]+" "+arr[k]);
					}
				}
	
		lalit.close();
	}
}

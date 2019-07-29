package com.bridgelabz.functional;
import java.util.Scanner;
import java.io.PrintWriter;

public class Two_D_Array {
	public static void main(String[] args) {
	int row, col;
	int arr[][] = new int[10][10];     
	
	PrintWriter writer = new PrintWriter(System.out);
	
	
	Scanner lalit =new Scanner(System.in);
	
	writer.write("Enter The Number of rows :");
	writer.flush();
	
	row= lalit.nextInt();
	
	writer.write("\nEnter The Number of columbs :");
	writer.flush();
	col= lalit.nextInt();
	
	writer.write("\nEnter The value for matrix :");
	writer.flush();
	for(int i=0; i< row; i++)
		for(int j=0; j< col; j++)
			arr[i][j]= lalit.nextInt();
	
	
	System.out.println();
	
	writer.write("The Matrix is as Follows \n");
	writer.flush();
	
	for(int i=0; i< row; i++)
	{
		for(int j=0; j< col; j++)
		{
			writer.write(arr[i][j]+ "  ");
			writer.flush();  
		}
			
			/*
			System.out.print(arr[i][j]+ "  ");
			*/
		System.out.println(" ");
	}
	
	lalit.close();
	writer.close();
	}
}

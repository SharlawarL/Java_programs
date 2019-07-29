package com.bridgelabz.functional;
import java.util.Scanner;

public class coin {
	public static void main(String[] args) { 
		
		Scanner lalit = new Scanner(System.in);
		System.out.print("Enter the number of times to flip coin :");
		double no = lalit.nextInt();
		double head=0,tail=0;
		//this loop for ***********
		
		for(int i=0;i<no;i++)
		{
			if (Math.random() < 0.5){
				System.out.println("Heads");
				head++;
			}else{
				System.out.println("Tails");
				tail++;
			}
		}
		double head1,tail1;
		
		head1= (tail/no)*100;
		tail1 = (head/no)*100;
		
		System.out.println("No of head :"+head1+" No of Tails :"+tail1+"\n\n\n");
		 
		lalit.close();
	} 
}

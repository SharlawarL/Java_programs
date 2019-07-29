package com.bridgelabz.algorithm;
import java.util.Scanner;

public class utility_Static_method {
	public static void main(String[] args) {
		
	//For binary integer search 
	int list[] = {0,1,2,3,4,5,6,7,8,9,10};
	
	Scanner lalit= new Scanner(System.in);
	
	
	
	System.out.print("Enter the search value :");
	int N = lalit.nextInt();
	
	int start = 0;
	int end = list.length;
	
	int result = utility.binarySearch_i(list,start,end-1,N);
	
	if(result == -1) {
		System.out.print("Elelment not found");
	}else {
		System.out.print("Element find at "+result);
	}
	
	// for binary word search
	
	String list1[] = {"aaa","bbb","ccc","ddd","eee","fff"};
	
	
	System.out.print("Enter the search value :");
	String N1 = lalit.nextLine();
	
	int start1 = 0;
	int end1 = list.length;
	
	int result1 = utility.binarySearch_w(list1,start,end-1,N1);
	
	int result2= result1-1;
	
	if(result == -1) {
		System.out.print("Element not found");
	}else {
		System.out.print("Element "+list[result1]+" is find at "+result1);
	}
	
	
	// for insertion sort for integer
	
	System.out.print("Enter Length of list :");
	int NL= lalit.nextInt();
	
	int list_i[] = new int[NL];
	
	System.out.print("Enter The Elements For Insertion Sort :");
	
	for(int i=0;i<NL;i++)
		list_i[i] = lalit.nextInt();
	
	int N_i = list.length;

	utility.insertion_i(list,N_i);
	
	
	// for insertion sort for word
	
	System.out.print("Enter Length of list :");
	int NL_i_w= lalit.nextInt();
	
	String list_i_w[] = new String[NL];
	
	System.out.print("Enter Tyhe Elements For Insertion Sort :");
	
	for(int i=0;i<NL;i++)
		list_i_w[i] = lalit.nextLine();

	int N_i_w = list_i_w.length;

	utility.insertion(list_i_w,N_i_w);
	
	//bobble sort integer
	
	System.out.print("Enter Length of list :");
	int NL_b_i= lalit.nextInt();
	
	int list_b_i[] = new int[NL_b_i];
	
	System.out.print("Enter Tyhe Elements For bubble Sort :");
	
	for(int i=0;i<NL_b_i;i++)
		list_b_i[i] = lalit.nextInt();
	
	int N_b_i = list_b_i.length;

	utility.bubble_i(list_b_i,N_b_i);
	
	//bobble sort for word
	
	System.out.print("Enter Length of list :");
	int NL_b_w= lalit.nextInt();
	
	String list_b_w[] = new String[NL_b_w];
	
	System.out.print("Enter Tyhe Elements For bubble Sort :");
	
	for(int i=0;i<NL_b_w;i++)
		list_b_w[i] = lalit.nextLine();
	
	int N_b_w = list_b_w.length;

	utility.bubble_w(list_b_w,N_b_w);
	
	lalit.close();
}
}

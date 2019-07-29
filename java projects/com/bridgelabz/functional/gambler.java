package com.bridgelabz.functional;
import java.util.Scanner;

public class gambler { 
 
    public static void main(String[] args) {
    	Scanner lalit = new Scanner(System.in);
    	
    	System.out.println("The gambler program");
    	
    	System.out.print("Enter The stake value :");
    	double stake = lalit.nextInt();
    	
    	System.out.print("Enter The Goal value :");
    	double goal = lalit.nextInt();
    	
    	System.out.print("Enter The trial value :");
    	double trial = lalit.nextInt();
    	
    	double win=0, loss=0,total=0;
    	
    	if(stake > 0)
    	{
    		if(goal > stake)
    		{
    			if(trial != 0)
    			{
    				    			
    				for(double t=0;t<trial;t++)
    				{
    					total++;
    					if(Math.random()< 0.5)
    					{
    						System.out.println("Win");
    						win++;
    						stake++;
    					}else {
    						System.out.println("loss");
    						stake--;
    						loss++;
    					}
    					if(stake == goal)
    					{
    						System.out.println("You won");
    						break;
    					}
    					if(stake == 0)
    					{
    						System.out.println("You loss");
    						break;
    					}
    				}
    	
    				System.out.println(win+" wins of "+trial);
    				System.out.println("Percent of game win ="+100.00*win/total);
    				System.out.println("Percent of game loss="+100.00*loss/total);
    	
    				lalit.close();
    			}else {
        		System.out.println("Please enter trial will be not less than 0");
    			}
    	
    		}else {
        		System.out.println("Please enter goal will be gretter than stake");
        	}
    	}else {
    		System.out.println("Please enter stack will be gretter than 0");
    	}
    }

}
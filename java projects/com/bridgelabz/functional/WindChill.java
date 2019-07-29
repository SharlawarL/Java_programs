
package com.bridgelabz.functional;

public class WindChill {
	
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		if(t<50 && v<120 && v>3)
		{	
		
		double w= 35.74+0.6215*t+(0.4275*t+35.75)*Math.pow(v,0.16);
		
		
		System.out.print("the National Weather Service defines the effective temperature (the wind chill) to be "+w);
		
		}else {
			System.out.println("Invalid Inputs..!!! Please Enter tempereture is not greter than 50 and velacity is less than 120 and gretter than 3. ");
		}
	}
}

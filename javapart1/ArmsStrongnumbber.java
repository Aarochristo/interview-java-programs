package com.javapart1;

import java.util.Scanner;

public class ArmsStrongnumbber {

	public static void main(String[] args) {

		 Scanner arm=new Scanner(System.in);
	        int number=arm.nextInt();
	        arm.close();
	       
	        
	        //122  % 10 =2
	        
	        //122/10=12
	        //
	        
	        int original=number;
	        
	        
	        int temp;
	        int store=0;
	        
	        while(number>0)
	        {
	        	temp=number%10;
	        	
	        	store=store+(temp*temp*temp);
	        	
	        	number=number/10;
	        }
	        
	        if(original==store)
	        {
	        	
	        	System.out.println("it is an armsstrong number");
	        }
	        else
	        {
	        	System.out.println("not an armstrong number");
	        }

	}

}

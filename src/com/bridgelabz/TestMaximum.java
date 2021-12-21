package com.bridgelabz;

import java.util.Scanner;

public class TestMaximum {
	 		 
		 public static void main (String[] args) {
			 
	        Scanner input = new Scanner(System.in);
	        System.out.println("enter numer1:" );
	        int x = input.nextInt();
	        System.out.println("enter numer2:" );
	        int y = input.nextInt();
	        System.out.println("enter numer3:" );
	        int z = input.nextInt();
	        Integer(x,y,z);
	        System.out.println("enter float1:" );
	        float a = input.nextFloat();
	        System.out.println("enter float2:" );
	        float b = input.nextFloat();
	        System.out.println("enter float3:" );
	        float c = input.nextFloat();
	        Float(a,b,c);
	        
	       
	        
		 }
        
	 
	 
	 public static void Integer (Integer x, Integer y,Integer z) {
		      Integer max = x;
		     if (y.compareTo(max) > 0 ) {
		    	max = y;
		     }
		     if (z.compareTo(max) > 0) {
		    	 max = z;
		     }
		    System.out.println("maximum number is " + max);
		     return ;
        }

	 
	 public static  void Float (Float a, Float b,Float c) {
		    Float max = b;
		   if (b.compareTo(max) > 0 ) {
		  	max = a;
		   }
		   if (c.compareTo(max) > 0) {
		  	 max = c;
		   }
		  System.out.println("maximum number is " + max);
		   return ;
		}
	 

}
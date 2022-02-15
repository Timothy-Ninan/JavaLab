package com.capgemini.sfdc.javaLab;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Age {
	
	public static void main(String[]args) throws Exception, AgeException{

	      Scanner age = new Scanner (System.in);
	      System.out.println("Enter your age");
	      int a = age.nextInt();
	      System.out.println("Enter you name");
	      String b = age.next();

	  try{  
	     if(a >125 && a<0){         
	        throw new Exception();
	     }          
	    }
	    finally{
	        System.out.println("Your age is " + a);
	        System.out.println("Your name is " + b);
	    }   
	}
	}
	 


package com.capgemini.sfdc.javaLab;

import java.util.Scanner;

// LAB 1.1

public class SumOfFirstNaturalNum {
	
	private int sum=0;
	public int calculateSum(int n)
	   {
	     for(int i=0;i<=n;i++)
	         {
	            if(i%3==0||i%5==0)
	              {
	                 sum+=i;
	              }
	         }
	            return sum;
	       }
	       public static void main(String[] ar)
	       {
	    	   SumOfFirstNaturalNum s1 = new SumOfFirstNaturalNum();
	              Scanner scn= new Scanner(System.in);
	              System.out.println("Enter the number:");
	              int n=scn.nextInt();
	              System.out.println(s1.calculateSum(n));
	       }
	
	

}

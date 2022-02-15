package com.capgemini.sfdc.javaLab;

import java.util.Scanner;

public class CalculateDifference {
int sum,sqsum;
	
    public int CalculateDifference(int n)
    {
           for(int i=1;i<=n;i++)
           {
                  sum+=i;
           }
           sum = sum*sum;
           
           for(int i=1;i<=n;i++)
           {
                  sqsum=sqsum+(i*i);
           }
           return sqsum-sum;
    }
    public static void main(String[] ar)
    {
    	CalculateDifference p = new CalculateDifference();
           Scanner scn = new Scanner(System.in);
           System.out.println("Enter a number");
           int n = scn.nextInt();
           System.out.println(p.CalculateDifference(n));
    }

}

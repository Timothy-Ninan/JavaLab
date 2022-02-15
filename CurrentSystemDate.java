package com.capgemini.sfdc.javaLab;

import java.time.LocalDate;
import java.time.Period;

public class CurrentSystemDate {
	

	 public static void main(String[] args) {
	      LocalDate date1 = LocalDate.of(2019, 3, 25);
	      LocalDate date2 = LocalDate.of(2019, 4, 29);
	      System.out.println("Date 1 = "+date1);
	      System.out.println("Date 2 = "+date2);
	      Period p = Period.between(date1, date2);
	      System.out.println("Period = "+p);
	      System.out.println("Years (Difference) = "+p.getYears());
	      System.out.println("Month (Difference) = "+p.getMonths());
	      System.out.println("Days (Difference) = "+p.getDays());

}
}

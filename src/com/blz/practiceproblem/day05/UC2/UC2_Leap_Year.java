package com.blz.practiceproblem.day05.UC2;

import java.util.Scanner;

public class UC2_Leap_Year {
	static final Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
    int year;
    System.out.println("Please enter year: ");
    year =SC.nextInt();
    if ((year % 4==0)&&(year% 100!=0)||(year%400==0)) {
    	System.out.println(+year+" is leap year");
    }
    else {
    	System.out.println(+year+" is not leap year");
    }
	}

}

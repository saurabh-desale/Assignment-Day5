package com.blz.practiceproblem.day05.UC10;

import java.util.Scanner;

public class UC10_Largest_Number {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter first number: ");
		a = SC.nextInt();
		System.out.println("Enter second number: ");
		b = SC.nextInt();
		System.out.println("Enter third number: ");
		c = SC.nextInt();
        if(a>c) {
        	if(a>b) {
        		System.out.println("first number is greater among three");
        	}
        	else {
        		System.out.println("second number is greater among three");        		
        	}
        }
        else {
        	System.out.println("third number is greater among three");        	
        }
	}

}

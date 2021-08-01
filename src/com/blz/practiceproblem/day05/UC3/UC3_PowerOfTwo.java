package com.blz.practiceproblem.day05.UC3;

import java.util.Scanner;

public class UC3_PowerOfTwo {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
	   
		int b= 1;
		System.out.println("Please mention power of two: ");
		int n = SC.nextInt();
		for (int i =1;i<=n;i++) {
			b = 2 * b;
			System.out.println("value of 2 raised to power" +i+"is: "+b);
	}
	}
}

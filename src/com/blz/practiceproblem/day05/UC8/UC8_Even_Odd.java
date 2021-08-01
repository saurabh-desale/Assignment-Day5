package com.blz.practiceproblem.day05.UC8;

import java.util.Scanner;

public class UC8_Even_Odd {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("To check the number is even or odd \n Please enter a number : ");
		int num = SC.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

}

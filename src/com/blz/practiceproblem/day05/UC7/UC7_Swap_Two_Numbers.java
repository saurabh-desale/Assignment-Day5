package com.blz.practiceproblem.day05.UC7;

import java.util.Scanner;

public class UC7_Swap_Two_Numbers {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int x, y, t;
		System.out.println("Enter X value: ");
		x = SC.nextInt();
		System.out.println("Enter Y value: ");
		y = SC.nextInt();
		t = x;
		x = y;
		y = t;
		System.out.println("After the swapping value of X is:" + x + "\n and value of Y is: " + y);
	}

}

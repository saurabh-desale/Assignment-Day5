package com.blz.practiceproblem.day05.functionalprograms.UC3;

import java.util.Scanner;

public class UC3_Distance {
	public static void main(String[] args) {
		int x,y;
		Scanner SC =new Scanner(System.in);
		System.out.println("Enter X co-ordinate of point: ");
		x = SC.nextInt();
		System.out.println("Enter Y co-ordinate of point: ");
		y = SC.nextInt();
		double distance = Math.sqrt(x*x + y*y);
		System.out.println("distance from ("+x + "," + y + ") to (0,0) = " + distance);
        SC.close();
	}
}

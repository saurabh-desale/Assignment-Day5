package com.blz.practiceproblem.day05.functionalprograms.UC4;

import java.util.Scanner;

public class UC4_Quadratic {
	public static void main(String[] args) {

		double a, b, c;
		double x1=0, x2=0;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = SC.nextDouble();
		System.out.println("Enter b: ");
		b = SC.nextDouble();
		System.out.println("Enter c: ");
		c = SC.nextDouble();
		double determinant = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(determinant);
		if (determinant > 0) {

			x1 = (-b + sqrt) / (2 * a);
			x2 = (-b - sqrt) / (2 * a);
			System.out.println("Root first X1: " + x1);
			System.out.println("Root second X2: " + x2);
		} else if (determinant == 0) {
			System.out.println("Root is : " + (-b + sqrt) / (2 * a));
		}
		SC.close();

	}
}

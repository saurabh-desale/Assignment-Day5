package com.blz.practiceproblem.day05.UC4;

import java.util.Scanner;

public class UC4_Harmonic_Number {
	public static void main(String[] args) {
		double i = 1;
		double sum = 0;
		System.out.println("Give us Nth Harmonic Number: ");
		Scanner SC = new Scanner(System.in);
		double n = SC.nextDouble();
		while (i <= n) {
			sum = sum + (1 / i);
			i++;
		}
		SC.close();
		System.out.println("Nth Harmonic value is : " + sum);
	}
}

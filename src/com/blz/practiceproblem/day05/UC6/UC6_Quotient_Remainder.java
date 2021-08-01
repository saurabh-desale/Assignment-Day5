package com.blz.practiceproblem.day05.UC6;

import java.util.Scanner;

public class UC6_Quotient_Remainder {
static final Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
         System.out.println("Enter dividend: ");
         int dividend=SC.nextInt();
         System.out.println("Enter divisor: ");
         int divisor =SC.nextInt();
         int quotient = dividend/divisor;
         int remainder= dividend%divisor;
         System.out.println("Quotient: "+quotient);
         System.out.println("Remainder: "+remainder);
         
	}
}

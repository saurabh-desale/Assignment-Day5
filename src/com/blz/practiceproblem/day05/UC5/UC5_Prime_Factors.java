package com.blz.practiceproblem.day05.UC5;

import java.util.Scanner;

public class UC5_Prime_Factors {
   static final	Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
         System.out.println("Enter a Number: ");
         int number = SC.nextInt();
         
         for (int i =2;i<number;i++) {
        	 while(number%i==0) {
        		 System.out.println(+i);
        		 number = number/i;
        	 }
         }
         if (number>2) {
        	 System.out.println(number);
         }
	}

}

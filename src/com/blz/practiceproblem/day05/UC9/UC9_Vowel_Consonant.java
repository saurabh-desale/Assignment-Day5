package com.blz.practiceproblem.day05.UC9;

import java.util.Scanner;

public class UC9_Vowel_Consonant {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter an alphabet: ");
		char ch = SC.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
	            System.out.println(ch+" is vowel");		
	            break;
	    default: System.out.println(ch+" is consonant");
		}
	}
}

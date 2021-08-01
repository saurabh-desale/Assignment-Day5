package com.blz.practiceproblem.day05.functionalprograms.UC1;

import java.util.Scanner;

public class UC1_Array_2D {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("row: ");
		int row = SC.nextInt();
		System.out.println("column: ");
		int column = SC.nextInt();

		int[][] intArray = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				intArray[i][j] = SC.nextInt();

			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(intArray[i][j]+" "  );
			}
			System.out.println();
		}

	}

}

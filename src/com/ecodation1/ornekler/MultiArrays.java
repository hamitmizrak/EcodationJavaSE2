package com.ecodation1.ornekler;

public class MultiArrays {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];
		matrix[0][0] = 0;
		matrix[1][1] = 1;
		matrix[2][2] = 2;
		matrix[3][3] = 3;

		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix.length; j++) { // sutun
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		//
		int matrix2[][] = { { 1, 1 }, { 2, 2 } };

		for (int i = 0; i < matrix2.length; i++) { // satır
			for (int j = 0; j < matrix2.length; j++) { // sutun
				System.out.print(matrix2[i][j]);
			}
			System.out.println();
		}
	}
}

package com.ecodation1.ornekler;

public class DizilerTutorials {

	public static void main(String[] args) {

		try {
			// dataType [] typeIsmi=new dataType [];
			Integer[] array = new Integer[4];
			// Default primitive: Tamsayılar=0 virgülle:0.0 boolean:false char=boş \u0000
			// Default wrapper: null
			// array[3] = 3;
			// array[0] = 0;
			// array[2] = 2;

			int[] array2 = { 3, 4, 5, 6, 7, 8, 9 };
			// System.out.println(array2[0]);

			// İterative for
			for (int i = 0; i < array2.length; i++) {
				// System.out.println(array2[i]);
			}

			// ForEach
			for (int temp : array2) {
				// System.out.println(temp);
			}

			// Çok boyutlu
			// int[][] matrix4 = new int[4][5];
			int[][] matrix4 = { { 1, 1, 2, 3 }, { 1, 2, 4, 6 }, { 3, 5, 9, 6 }, { 4, 5, 7, 8 } };
			// matrix4[3][1] = 4;
			// matrix4[3][3] = 3;

			for (int i = 0; i < matrix4.length; i++) { // satır
				for (int j = 0; j < matrix4.length; j++) {
					System.out.print(matrix4[i][j]);
				}
				System.out.println();
			}

			// System.out.println(array[2] + array[3]);
			// System.out.println(array[1]);
			// System.out.println(array[5]);
		} catch (Exception e) {
			e.printStackTrace();

			// System.out.println(e.getLocalizedMessage());
		}

		// System.out.println("deneme");
	}
}

package com.ecodation1.ornekler;

public class SingleArrays {

	public static void main(String[] args) {

		try {
			// byte,short,int,long boolean,char, float,double
			double[] dizi = new double[10];
			dizi[0] = 0;
			dizi[2] = 2;
			dizi[9] = 9;
			dizi[3] = 3;
			// System.out.println(dizi[6]);

			for (int i = 0; i < dizi.length; i++) {
				// System.out.println(dizi[i]);
			}

			// manuel dizi ekleme
			int array[] = { 4, 8, 12, 16, 20 };
			// System.out.println(array[2]);

			for (int temp : array) {
				System.out.println(temp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("devam");

	}
}

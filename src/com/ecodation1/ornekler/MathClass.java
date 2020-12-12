package com.ecodation1.ornekler;

import java.util.Random;

public class MathClass {

	public static void main(String[] args) {

//		System.out.println(Math.PI);
//		System.out.println(Math.E);

//		System.out.println("2^5= " + Math.pow(2, 5));
//		System.out.println("en düşük: " + Math.min(3, 5));
//		System.out.println("en büyük:" + Math.max(1000, -1));
//		System.out.println("karekök:" + Math.sqrt(16));
//		System.out.println(Math.ceil(2.1));
//		System.out.println(Math.floor(2.9));
//		System.out.println(Math.round(2.5));
//		System.out.println(Math.random() * 5 + 1); // 1<= random <=5

		Random rnd = new Random();
		int x = rnd.nextInt(5) + 1; // 1<=x<=5
		System.out.println(x);

	}
}

package com.ecodation2.dersler;

public class Ders010_Math {
	public static void main(String[] args) {
		// Math Sınıfının methodları static methoddur. 

		System.out.println("E " + Math.E);
		System.out.println("PI " + Math.PI);

		System.out.println(Math.max(4.5, 6.9)); // 2 double sayı arasında büyük olanı göster
		System.out.println(Math.min(4.5, 6.9)); // 2 double sayı arasında küçük olanı göster

		System.out.println(Math.abs(-4)); // mutlaka = mutlak
		System.out.println(Math.pow(2, 5));// üstlü sayılar 2 ^ 5=32
		System.out.println(Math.sqrt(16)); // karekök

		// yuvarlamalar floor=aşağı yayuvarla , ceil=yukarı yuvarla , round= floor +ceil
		System.out.println(Math.floor(6.1)); // aşağıya yuvarlar
		System.out.println(Math.ceil(16.011)); // yukarı yuvarlar
		System.out.println("round:" + Math.round(6.1));
		System.out.println("round:" + Math.round(6.4));
		System.out.println("round:" + Math.round(6.5)); // 5 ve yukarısını yukarıya tamamlar:
		System.out.println("round:" + Math.round(6.9));

		double rastgele = (Math.random() * 5 + 1); // 1 <=x<=5
		System.err.println("rastgele sayılar:" + rastgele);
	}

}

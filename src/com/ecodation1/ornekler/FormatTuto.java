package com.ecodation1.ornekler;

public class FormatTuto {

	public static void main(String[] args) {
		// Se - De(Decimal) - F

		/*
		 * //1.YÖNTEM 10.2=> sol=10 alan sağda yani virgülden sonra 2 alan ayırmaya
		 * yarar. s=string d=decimal (10 luk sistem) f=virgüllü (kayan noktalı)
		 * System.out.printf("%5s %d %10.2f \r\n",s,i,d); String
		 */

//		String s = "Ecodation Java SE Hamit Mızrak";
//		int d = 44;
//		float f = 34.23f;
//		System.out.printf("%s %d %f", s, d, f);
//		System.out.println();
//		System.out.printf("%50s %d %f", s, d, f);
//		System.out.println();
//		System.out.printf("%50s %d %10.2f", s, d, f);

		String stringx = "Merhabalar";
		float floatx = 44.44f;
		int decimalx = 34;
		// System.out.println(str + " " + ftr + " " + itr);

		// Se De F
		System.out.printf("%50s %d %12.4f", stringx, decimalx, floatx);

	}

}

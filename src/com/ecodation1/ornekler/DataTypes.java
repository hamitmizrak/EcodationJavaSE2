package com.ecodation1.ornekler;

public class DataTypes {
	public static void main(String[] args) {
		// Tam sayılar (emBSİL)
		// f-L
		byte b2 = 12;
		// b2=null;
		short s2 = 123;
		int i2 = 1234;
		long l2 = 12345L;
		System.out.println(b2);

		// Virgüllü
		float f2 = (float) 12.52; // 12.52f
		double d2 = 1212.5252;

		boolean b3 = 12 > 5;
		char c2 = 'a';
		char c3 = '\u02A4';
		System.out.println(c3);

		// Wrapper Class
		Short wrapper = new Short((short) 4);
		wrapper = null;
		// Byte > Short > Integer > Long
		// Float> Double
		// Boolean
		// Character
	}
}

package com.ecodation2.dersler;

public class Ders012_Cast {
	public static void main(String[] args) {
		// BOXING

		// primitive = obje değildir. bunlar wrapperlardan beslenir.
		// tam sayılar = b < s < i < l
		byte b2;
		short s2;
		int i2;
		long l2;

		// virgüllü sayılar : f d
		float f2;
		double d2;

		// boolean
		boolean booleanB2;
		// char
		char c2;

		// Wrapper Class = Obje düzeydedir.
		Byte b5 = new Byte((byte) 5);
		Short s5;// gc
		s5 = new Short((short) 6);
		Integer i5 = new Integer(12);
		Long l5 = new Long(12);
		Float f5 = new Float(12.5);
		Double d5 = new Double(24.55);
		Boolean booleanB5 = new Boolean(true);
		Character c5 = new Character('a');
		String str5 = new String();
		String str6 = new String("Kelime");
		String str7 = "Merhabalar";
		String str8;

	}

}

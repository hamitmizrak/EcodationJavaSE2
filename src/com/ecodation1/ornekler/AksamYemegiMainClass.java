package com.ecodation1.ornekler;

import java.util.List;

public class AksamYemegiMainClass {

	public static void main(String[] args) {
		AksamYemegi aksam = new AksamYemegi();

		List<String> ogunList;
		aksam.gunlerList();

		ogunList = aksam.iceceklerList();
		aksam.genelIslem(ogunList);

		ogunList = aksam.sicakList();
		aksam.genelIslem(ogunList);

		ogunList = aksam.meyveList();
		aksam.genelIslem(ogunList);

		ogunList = aksam.tatliList();
		aksam.genelIslem(ogunList);

//		System.out.println("\niçecekler");
//		aksam.icecekler();
//		System.out.println("\nmeyveler");
//		aksam.meyveler();
//		System.out.println("\nsicak icecekler");
//		aksam.sicakIcecek();
//		System.out.println("\ntatlı");
//		aksam.tatli();

	}
}

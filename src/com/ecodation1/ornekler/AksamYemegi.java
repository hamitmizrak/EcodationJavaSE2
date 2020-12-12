package com.ecodation1.ornekler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class AksamYemegi {

	/*
	 * pazartesi-salı-çarşamba-perşembe -cuma -cumartesi -pazar
	 * 
	 * sıcak içecekler: yüksük çorbası,ezo gelin çorbası,mercimek çorbası ana öğün:
	 * kebab,kurufasülye icecekler: soda,ayran,fanta,kola meyve: elma,armut,erik
	 * tatlı: güllaç,muhallebi,irmik tatlısı
	 */
	public void genelIslem(List<String> ogun) {
		Map<Integer, String> sicakIcecek = new HashMap<Integer, String>();
		for (int i = 0; i < ogun.size(); i++) {
			sicakIcecek.put(i, ogun.get(i));
		}

		Random random = new Random();
		int sicak = random.nextInt(ogun.size());
		String deger = sicakIcecek.get(sicak);
		System.out.println(deger);

	}

	public enum gunler {
		pazartesi, sali, carsamba, persembe, cuma, cumartesi, pazar;
	}

	public void gunlerList() {

		gunler[] gunDizisi = gunler.values();
		Random random = new Random();
		int gun = random.nextInt(7);
		gunler deger = gunDizisi[gun];
		System.out.println(deger);

	}

	public List<String> iceceklerList() {
		List<String> ogunList = new ArrayList<String>();
		ogunList.add("soda");
		ogunList.add("ayran");
		ogunList.add("kola");
		ogunList.add("fanta");
		return ogunList;
	}

	public List<String> meyveList() {
		List<String> ogunList = new ArrayList<String>();
		ogunList.add("elma");
		ogunList.add("armut");
		ogunList.add("erik");
		return ogunList;
	}

	public List<String> tatliList() {
		List<String> ogunList = new ArrayList<String>();
		ogunList.add("güllaç");
		ogunList.add("muhallebi");
		ogunList.add("irmik tatlısı");
		return ogunList;
	}

	public List<String> ogunList() {
		List<String> ogunList = new ArrayList<String>();
		ogunList.add("kebap");
		ogunList.add("kurufasülye");
		ogunList.add("Analı kızlı");
		ogunList.add("zeytin yağlı");
		ogunList.add("dolma");
		ogunList.add("yeşil fasülye");
		return ogunList;
	}

	public List<String> sicakList() {
		List<String> ogunList = new ArrayList<String>();
		ogunList.add("ezo gelin çorbası");
		ogunList.add("mercimek çorbası");
		return ogunList;
	}
}

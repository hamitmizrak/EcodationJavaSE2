package com.ecodation1.ornekler;

public class KemanMainClassExtends {

	public static void main(String[] args) throws InterruptedException {

		KemanViolinExtends yay = new KemanViolinExtends("yay");

		KemanViolinExtends on = new KemanViolinExtends("onPanel");

		KemanViolinExtends yan = new KemanViolinExtends("yanPanel");

		KemanViolinExtends arka = new KemanViolinExtends("arkaPanel");

		KemanViolinExtends kopru = new KemanViolinExtends("kopru");

		KemanViolinExtends diger = new KemanViolinExtends("diger");
		// System.out.print("yay:");
		// System.out.print("ön panel:");

		yay.start();
		System.out.print("yay:");
		yay.join();

		on.start();
		System.out.print("ön panel:");
		on.join();
		yan.start();
		System.out.print("yan panel:");
		yan.join();
		arka.start();
		System.out.print("arka panel:");
		arka.join();

		kopru.start();
		System.out.print("köprü:");
		kopru.join();

		diger.start();
		System.out.print("diğer:");
		diger.join();

	}

}

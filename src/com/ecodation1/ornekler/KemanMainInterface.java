package com.ecodation1.ornekler;

public class KemanMainInterface {
	public static void main(String[] args) throws InterruptedException {

		Thread yay = new Thread(new KemanViolinImplements("yay"));
		Thread on = new Thread(new KemanViolinImplements("onPanel"));
		Thread yan = new Thread(new KemanViolinImplements("yanPanel"));
		Thread arka = new Thread(new KemanViolinImplements("arkaPanel"));
		Thread kopru = new Thread(new KemanViolinImplements("kopru"));
		Thread diger = new Thread(new KemanViolinImplements("diger"));

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

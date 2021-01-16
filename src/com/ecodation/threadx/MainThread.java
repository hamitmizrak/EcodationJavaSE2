package com.ecodation.threadx;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		// Extends Thread thread
		KalitimThread kalitimThread = new KalitimThread();
		System.out.println(kalitimThread.getName());
		kalitimThread.setName("Deneme");
		System.out.println(kalitimThread.getName());
		System.out.println(kalitimThread.isAlive());
		kalitimThread.start();
		System.out.println(kalitimThread.isAlive());
		
		kalitimThread.join();
		KalitimThread2 kalitimThread2 = new KalitimThread2();
		kalitimThread.wait();// durdurmak için
		kalitimThread.notify();// uyuyan threadi kaldırmak
		kalitimThread.notifyAll();// büütn threadleri kaldı
		kalitimThread2.start();
		
		// anonymous thread
		Thread thread = new Thread() {
			public void run() {
				// method2();
				for (int i = 2; i < 20; i += 2) {
					System.out.println(i + " anonymous thread");
				}
			}
		};
		thread.start();
		
		// anonoymous Thread implements
		Thread deneme3 = new Thread(new Runnable() {
			@Override
			public void run() {
				// kodlar buraya
			}
			
		});
		deneme3.start();
		
		// Implements Runnable
		Thread implementsThread = new Thread(new ImplementsThread());
		implementsThread.start();
		
	}
}

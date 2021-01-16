package com.ecodation.threadx;

public class KalitimThread2 extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " . thread2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted hatası");
				e.printStackTrace();
			}
		}
		
	}
	
}

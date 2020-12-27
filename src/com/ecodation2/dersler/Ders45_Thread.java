package com.ecodation2.dersler;

public class Ders45_Thread extends Thread {
	// getName setName isAlive() join() Sleep() start() run()
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

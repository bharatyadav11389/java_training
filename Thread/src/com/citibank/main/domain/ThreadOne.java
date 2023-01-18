package com.citibank.main.domain;

public class ThreadOne extends Thread{
	public void run() {
		System.out.println("we are in the ThreadOne");
		for (int i= 0; i < 1000; i++) {
			System.out.println("Thrad One ::"+ i);
			try {
				Thread.sleep(100);
				
			}
			catch(InterruptException e) {
				e.printStackTrace();
			}
		}
	}
}

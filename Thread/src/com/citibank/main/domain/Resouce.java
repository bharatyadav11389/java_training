package com.citibank.main.domain;

public class Resouce {
	
	public synchronized void message(String textMessage) {
		System.out.print("[");
		System.out.print(textMessage);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}

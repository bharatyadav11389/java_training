package com.citibank.main.domain;

public class MyThread implements Runnable{
	
	private Resouce resouce;
	private String textMessage;
	
	public MyThread(Resouce resouce, String textMessage) {
		super();
		this.resouce = resouce;
		this.textMessage = textMessage;
	}

	@Override
	public void run() {
	
		resouce.message(textMessage);
	
	}

}

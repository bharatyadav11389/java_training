package com.citibank.main;

import com.citibank.main.domain.MyAccount;


public class SyncMain {


	public static void main(String[] args) {
		
//		Thread thread = Thread.currentThread();
//		System.out.println(thread);
//		thread.setName("Main Thread");
//		thread.setPriority(9);
//		System.out.println(thread);
//		
//		Resouce resouce = New Resouce();
//		resouce.message("Hi");
//		resouce.message("Hello");
//		resouce.message("How are you doing today?");

		MyAccount myaccount = New MyAccount();
		MyThread myThreadOne = new MyThread(resouce, "Hi");
		Thread thread1 = new Thread(myThreadOne);
		thread1.start();
		
		MyThread myThreadTwo = new MyThread(resouce, "Hello");
		Thread thread2 = new Thread(myThreadTwo);
		thread2.start();
		
		MyThread myThreadThree = new MyThread(resouce, "How are you doing");
		Thread thread3 = new Thread(myThreadThree);
		thread3.start();
		
		
		
	}

}

package com.citibank.main;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
//		Greeter greeter = new GoodMorningGreeter();
//		greeter.greet();
		Greeter goodEveningGreeter = new Greeter() {
			
			@Override
			public void greet() {
				System.out.println("Good Evening Java");
				
			}
		};
		goodEveningGreeter.greet();
		System.out.println("--------------------");
		Greeter greeter2 = () -> {
			System.out.println("this is lamda code");
		};
		greeter2.greet();
		
		Greeter goodNightGreeter = () -> System.out.println("Good Night Java");
		goodNightGreeter.greet();
		
		Runnable runnable = ()-> System.out.println("we are in thread");
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("--------------------------------------");
		
		Thread thread2 = new Thread (
				() -> System.out.println("we are in thread2")
				);
		thread.start();
		
		System.out.println("---------------------------------------");
		new Thread(()-> System.out.println("We are in thread")).start();
		new Thread(()-> {
			for(int i= 0;i<10;i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread is running");
					}
			}
		}
		
	}

}

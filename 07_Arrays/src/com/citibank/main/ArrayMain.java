package com.citibank.main;

public class ArrayMain {

	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers[0] = 1000000000;

		
		for (int i : numbers) {
			System.out.println(i);
			i = i+1;
			System.out.println(i);
		}
		System.out.println("---------------------");
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}

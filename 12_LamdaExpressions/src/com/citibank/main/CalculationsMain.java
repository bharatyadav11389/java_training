package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalculationsMain {

	public static void main(String[] args) {
		CalculationsInterface calculate = new CalculationsInterface() {
			
			@Override
			public double docalculations(double number1, double number2) {
				return(number1+number2);
			}
		};
		
		double result = CalculationsInterface.docalculations(10,20);
		System.out.println("addition::" + result);
		
		System.out.println("-------------------------------------");
		calcuationsInterface = (number1,number2) -> number1+number2;
		System.out.println("Result ::" + calcuaiotnsInterface);
		
	}

}

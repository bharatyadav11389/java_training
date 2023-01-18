package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		System.out.println("Default Constructor of Circle");
	}
	
	public Circle(int size) {
		super(size);
		   System.out.println("Param Constructor of Circle");
		   System.out.println("Size :: " + size);
	}   
	public void draw() {
		
		System.out.println("Drawing Circle");
	}
	
}

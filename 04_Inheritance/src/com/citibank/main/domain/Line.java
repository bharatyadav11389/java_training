package com.citibank.main.domain;

public class Line extends Shapes {
  public Line() {
	  
	  System.out.println("Default constructor of line");
  }
  
  public Line(int size) {
	   System.out.println("Param Constructor of Line");
	   System.out.println("Size :: " + size);
  }
	public void draw() {
		
		System.out.println("Drawing Line");
	}
}

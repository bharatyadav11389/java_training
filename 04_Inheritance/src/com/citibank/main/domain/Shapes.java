package com.citibank.main.domain;

//Generalized class
public abstract class Shapes extends Object {
  public Shapes () {
	  System.out.println("Default constructor of Shapes");

	}
   public Shapes(int size) {
	   
	     System.out.println("Param Constructor of Shapes");
	     System.out.println("Size :: " + size);
   }
  public abstract void draw();
  
  public void convertShapes() {
	  System.out.println("converting Shapes");
	  
  }
}

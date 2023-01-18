package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
//		Circle circle = new Circle(10);
//		circle.draw();
		
//		Shapes shapes = new Circle();
//		shapes.draw();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Circle 2 .Traingle  3. Line");
		System.out.println("Enter your Choice");
		
		int choice = scanner.nextInt();
		Shapes shapes = getshape(choice);
		shapes.draw();
	}
public static Shapes getshape(int choice) {
	if (choice ==1) {
		Shapes shapes = new Circle();
		return shapes;
		
	}
	if (choice ==2) {
		Shapes shapes = new Triangle();
		return shapes;
	}
	if (choice ==3) {
		Shapes shapes = new Line();
		return shapes;
	}
	return null;
}
}

/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 8
*/

import java.util.Scanner;

public class ComputeAreas {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double inputOne, inputTwo;
		
		System.out.print("Square side: ");
		inputOne = scnr.nextDouble();
		System.out.print("Square area: "); 
		System.out.printf("%.2f\n\n", squareArea(inputOne));
		
		System.out.print("Rectangle width: ");
		inputOne = scnr.nextDouble();
		System.out.print("Rectangle height: ");
		inputTwo = scnr.nextDouble();
		System.out.println("Rectangle area: " + rectangleArea(inputOne, inputTwo) + "\n");
		
		System.out.print("Circle radius: ");
		inputOne = scnr.nextDouble();
		System.out.println("Circle area: " + circleArea(inputOne) + "\n");
		
		System.out.print("Triangle base: ");
		inputOne = scnr.nextDouble();
		System.out.print("Triangle height: ");
		inputTwo = scnr.nextDouble();
		System.out.println("Triangle area: " + triangleArea(inputOne, inputTwo) + "\n");
		
		scnr.close();
	}

	static double squareArea(double side) {
		return (side * side);
	}
	
	static double rectangleArea(double side, double length) {
			return (side * length);
	}
	
	static double circleArea(double radius) {
		return (3.14 * (radius * radius));
	}
	
	static double triangleArea(double base, double height) {
		return ((base * height) / 2);
	}
}

/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class Colors {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		float red, green, blue;
		
		System.out.print("Please tell me your red value: ");
		red = scnr.nextInt();
		
		System.out.print("Please tell me your green value: ");
		green = scnr.nextInt();
		
		System.out.print("Please tell mm your blue value: ");
		blue = scnr.nextInt();
		
		red = (red / 255);
		green = (green / 255);
		blue = (blue / 255);
		
		System.out.print("New color is red=");
		System.out.printf("%.3f", red);
		System.out.print(", green=");
		System.out.printf("%.3f", green);
		System.out.print(", blue=");
		System.out.printf("%.3f", blue);
		
		scnr.close();
	}
}

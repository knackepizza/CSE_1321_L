/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class MinMaxAvg {

	static int max(int x, int y, int z) {
		if (x > y & x > z) {
			return x;
		} else if (y > x & y > z) {
			return y;
		} else {
			return z;
		}
	}
	
	static int min(int x, int y, int z) {
		if (x < y & x < z) {
			return x;
		} else if (y < x & y < z) {
			return y;
		} else {
			return z;
		}
	}
	
	static int average(int x, int y, int z) {
		return ((x + y + z) / 3);
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.print("Enter x value: ");
		x = scnr.nextInt();
		System.out.print("Enter y value: ");
		y = scnr.nextInt();
		System.out.print("Enter z value: ");
		z = scnr.nextInt();
		
		System.out.println("You entered: " + x + ", " + y + ", " + z);
		System.out.println("Max value: " + max(x, y, z));
		System.out.println("Min value: " + min(x, y, z));
		System.out.println("Average value: " + average(x, y, z));
		
		scnr.close();
	}

}

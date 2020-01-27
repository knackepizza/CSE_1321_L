/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class SumEven {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int max, sum = 0;

		System.out.print("Enter a value: ");
		max = scnr.nextInt();
		
		System.out.println("Entered value: " + max);
		
		for (int i = 2; i <= max; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum of even numbers between 2 and " + max + " is " + sum);
		
		scnr.close();
	}

}

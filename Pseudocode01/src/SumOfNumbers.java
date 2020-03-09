/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int number, sum;
		
		System.out.print("Enter a number: ");
		number = scnr.nextInt();
		
		sum = (((number + 1) * number ) / 2);
		
		System.out.println("The sum of the numbers between 1 and " + number + " is " + sum);
		
		scnr.close();
	}

}

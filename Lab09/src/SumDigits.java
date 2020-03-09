/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 9
*/

import java.util.Scanner;

public class SumDigits {

	static int sumDigits(int number) {
		int sum = 0;
		while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum; 
	}
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		
		System.out.print("You entered: ");
		num = scnr.nextInt();

		System.out.println("Sum of digits: " + sumDigits(num));
		
		scnr.close();
	}

}

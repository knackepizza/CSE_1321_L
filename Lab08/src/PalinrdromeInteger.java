/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 8
*/

import java.util.Scanner;

public class PalinrdromeInteger {

	static int reverse(int number) {
		int reverse = 0;
		while(number != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + number % 10;
	      number = number / 10;
	    }
		return reverse;
	}
	
	static String isPalindrome(int number) {
		if (number == reverse(number)) {
			return "Palindrome";
		} else {
			return "Not Palindrome";
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number: ");
		num = scnr.nextInt();
		
		System.out.println("Entered value: " + reverse(num));
		System.out.println("Judgement: " + isPalindrome(num));
		
		scnr.close();
	}

}

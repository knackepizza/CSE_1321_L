/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class Symbol {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		char symbol;
		int num;
		
		System.out.print("Enter a symbol: ");
		symbol = scnr.next().charAt(0);
		
		System.out.print("Enter a number: ");
		num = scnr.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		scnr.close();
	}
}

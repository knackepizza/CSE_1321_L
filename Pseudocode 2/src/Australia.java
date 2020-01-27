/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class Australia {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double hectares, acres = 2.47, trees = 456;
		
		System.out.print("How many hectares were destroyed today? ");
		hectares = scnr.nextDouble();
		
		trees = ((hectares * acres) * trees);
		System.out.println("This many trees were destroyed today: " + trees);

		scnr.close();
	}

}

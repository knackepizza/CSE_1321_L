/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 4
*/

import java.util.Scanner;

public class WeeklyPay {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int hours, overtime = 0;
		double rate = 10.0, total;
		
		System.out.print("Enter your hours: ");
		hours = scnr.nextInt();

		System.out.println("You entered " + hours + " hours.");
		

		if (hours > 40) {
			overtime = (hours - 40);
			hours -= overtime;
		} 
		
		total = ((hours * rate) + (overtime * (rate * 1.5)));
		System.out.println("Gross earning is $" + (total));
		
		scnr.close();
	}

}

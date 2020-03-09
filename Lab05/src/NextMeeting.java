/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class NextMeeting {
	
	static String getCurrentDay(int day) {
		String theDay;
		switch (day) {
			case 0:
				theDay = "Sunday";
				break;
			case 1:
				theDay = "Monday";
				break;
			case 2:
				theDay = "Tuesday";
				break;
			case 3:
				theDay = "Wednesday";
				break;
			case 4:
				theDay = "Thursday";
				break;
			case 5:
				theDay = "Friday";
				break;
			default:
				theDay = "Saturday";
				break;
		}
		return theDay;
	}
	
	static String getFinalDay(int days, int daysUntil) {
		int daysIndex = (days + daysUntil) % 7;
		return (getCurrentDay(daysIndex));
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int theDay, theDaysUntil;
		
		System.out.print("What is today? ");
		theDay = scnr.nextInt();
		System.out.print("How many days until? ");
		theDaysUntil = scnr.nextInt();
		
		System.out.println("\nToday is " + getCurrentDay(theDay));
		System.out.println("Days to the meeting is " + theDaysUntil + " days");
		System.out.println("Meeting day is " + getFinalDay(theDay, theDaysUntil));

		scnr.close();
	}
}
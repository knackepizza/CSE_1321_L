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
	static final String[] DAYS_LIST = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	static String getCurrentDay(int day) {
		return DAYS_LIST[day];
	}
	
	static String getFinalDay(int days, int daysUntil) {
		int daysIndex = (days + daysUntil) % 7;
		return (DAYS_LIST[daysIndex]);
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int theDay, theDaysUntil;
		
		System.out.print("What is today? ");
		theDay = scnr.nextInt();
		System.out.print("How many days until? ");
		theDaysUntil = scnr.nextInt();
		
		System.out.println("Today is " + getCurrentDay(theDay));
		System.out.println("Days to the meeting is " + theDaysUntil + " days");
		System.out.println("Meeting day is " + getFinalDay(theDay, theDaysUntil));

		scnr.close();
	}
}
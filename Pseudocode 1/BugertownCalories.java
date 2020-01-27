/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class BugertownCalories {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int calories, days, excess;
		float weight;
		
		System.out.print("Enter the number of calories you will consume per day: ");
		calories = scnr.nextInt();
		
		System.out.print("Enter the number of days you will eat this much: ");
		days = scnr.nextInt();
		
		excess = (calories - 2500);
		weight = (excess * days); // to keep value as float
		weight = (weight / 3600);
		
		System.out.print("Weight change is ");
		System.out.printf("%.4f", weight);
		System.out.println(" lbs");
		
		scnr.close();
	}
}

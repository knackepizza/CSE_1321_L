/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 7
*/

public class Shape {

	public static void main(String[] args) {
		int spaces = 7;
		int stars = 1;
		
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= stars; k++) {
				System.out.print("*");
			}
			System.out.println();
			stars += 2;
			spaces -= 1;
		}
	}
}

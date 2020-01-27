/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

public class RandomNumbers {

	static double getRandomNumber() {
		double x = Math.random();
		int min = 1, max = 50;
		return (x * ((max - min) + 1)) + min;
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%.0f\n", getRandomNumber());
		}

	}

}

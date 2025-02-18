/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 12
*/

import java.util.Random;

public class ArrayMethods {
	static int arrayMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < 5; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	static int arrayMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < 5; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	static void arraySquared(int[] arr) {
		System.out.print("\nSquared array:  ");
		for (int i = 0; i < 5; i++) {
			arr[i] = (arr[i] * arr[i]);
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i]);
			if (i != 4) {
				System.out.print(", ");
			}
		}
	}
	
	static void arrayReverse(int[] arr) {
		System.out.print("\nReversed array: ");
		int counter = 4;
		int[] newArr = new int[5];
		for (int i = 0; i < 5; i++) {
			newArr[i] = arr[counter--];
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(newArr[i]);
			if (i != 4) {
				System.out.print(", ");
			}
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] array = new int[5];
		
		for (int i = 0; i < 5; i++) {
			array[i] = (rand.nextInt(99) + 1);
		}
		
		System.out.print("Original Array: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i]);
			if (i != 4) {
				System.out.print(", ");
			}
		}
		
		System.out.print("\nMax Value:      " + arrayMax(array));
		System.out.print("\nMin Value:      " + arrayMin(array));
		arraySquared(array);
		arrayReverse(array);
	}

}

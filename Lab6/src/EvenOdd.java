/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

public class EvenOdd {
	public static void main(String[] args) {
		// The counter for even and odd are declared, so I don't have to put count at 50 again later.
		int evenCount = 50, oddCount = 50;
		
		System.out.print("Even numbers between 50 and 100: ");
		// While the even counter is equal to or below 100, it will print a number. (range 50 - 100)
		while (evenCount <= 100) {
			// If the remainder of the current number is 0, it will print it. (0R = even num)
			if (evenCount % 2 == 0) {
				System.out.print(evenCount + ", ");
			} 
			// Increment even count so we move forward towards 100.
			evenCount++;
		}
		
		System.out.println();
		System.out.print("Odd numbers between 50 and 100: ");
		// While the odd counter is equal to or below 100, it will print a number. (range 50 - 100)
		while (oddCount < 100) {
			// If the remainder of the current number is 1, it will print it. (1R = even num)
			if (oddCount % 2 == 1) {
				System.out.print(oddCount + ", ");
			} 
			// Increment odd count so we move forward towards 100.
			oddCount++;
		}
	}
}

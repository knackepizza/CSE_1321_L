/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: Assignment 4
*/

public class Weight {
    public static void main(String[] args) {
        float weight = 1;
        int count = 1;
        
        while (weight > 0.05) {
            weight -= 0.05;
            System.out.println("You take bite #" + count + " out, now weighs " + weight);
            count++;
        }
    
    }
}
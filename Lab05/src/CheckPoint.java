/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class CheckPoint {

    static String getGraphArea(int x, int y) {
        if (x == 0 & y == 0) {
            return "on the origin point.";
        } else if (y == 0) {
            return "on the x-axis.";
        } else if (x == 0) {
            return "on the y-axis.";
        } else if (x > 0 & y > 0) {
            return "in the first quadrant.";
        } else if (x < 0 & y > 0) {
            return "in the second quadrant.";
        } else if (x < 0 & y < 0) {
            return "in the third quadrant.";
        } else if (x > 0 & y < 0) {
            return "in the fourth quadrant.";
        } else {
            return "in the middle of nowhere.";
        }
        
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int x, y;

        System.out.print("What is your x coordinate? ");
        x = scnr.nextInt();
        System.out.print("What is your y coordinate? ");
        y = scnr.nextInt();

        System.out.println("\nX-coordinate is  " + x);
        System.out.println("Y-coordinate is  " + y);
        System.out.println("(" + x + ", " + y + ") is " + getGraphArea(x, y));

        scnr.close();
    }
}
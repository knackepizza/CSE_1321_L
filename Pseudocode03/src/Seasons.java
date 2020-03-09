/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 5.5 (Assignment 3)
*/

import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int month, day;
        String season = ""; 

        System.out.print("Enter the month: ");
        month = scnr.nextInt();

        System.out.print("Enter the day: ");
        day = scnr.nextInt();

        switch (month) {
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
                if (day < 19) {
                    season = "winter";
                } else {
                    season = "spring";
                }
                break;
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
                if (day < 20) {
                    season = "spring";
                } else {
                    season = "summer";
                }
                break;
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
                if (day < 22) {
                    season = "summer";
                } else {
                    season = "fall";
                }
                break;
            case 10:
            case 11:
                season = "fall";
                break;
            case 12:
                if (day < 21) {
                    season = "fall";
                } else {
                    season = "winter";
                }
                break;
        }

        System.out.println("It is " + season + "!");
        
        scnr.close();
    }
}
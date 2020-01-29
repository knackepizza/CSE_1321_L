/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 5.5 (Assignment 3)
*/

import java.util.Scanner;
public class Admissions {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double gpa, ielts;
        char isIntStudent, language;

        System.out.print("Enter your GPA: ");
        gpa = scnr.nextDouble();

        System.out.print("Are you an International Student? ");
        isIntStudent = scnr.next().charAt(0);

        if (gpa >= 2.75 & isIntStudent == 'N') {
            System.out.println("You've been accepted!");
        } else if (gpa <= 2.75 & isIntStudent == 'N') {
            System.out.println("Thank you for your application. REJECTED!");
        } else {
            System.out.print("Enter your IELTS score: ");
            ielts = scnr.nextDouble();

            if (ielts >= 6.5) {
                System.out.println("You've been accepted!");
            } else {
                System.out.print("Was your undergraduate taught in English? ");
                language = scnr.next().charAt(0);
                
                if (gpa >= 3.0 & language == 'Y') {
                    System.out.println("You've been accepted!");
                } else {
                    System.out.println("Thak you for your application. REJECTED!");
                }
            }
        }

        scnr.close();
    }
}
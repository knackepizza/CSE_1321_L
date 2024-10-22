package com.gradescope.Assignment5;

/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: Assignment 5
*/

import java.util.Scanner;

public class A5_1 
{
    static void drawBox(int size) {
        int rows = size;
        int cols = size;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0 || j == (cols - 1) || i == (rows - 1) || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userInput;

        System.out.print("Enter the size of the box: ");
        userInput = scnr.nextInt();

        drawBox(userInput);

        scnr.close();
    }
}
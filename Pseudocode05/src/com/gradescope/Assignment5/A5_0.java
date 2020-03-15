package com.gradescope.Assignment5;

/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: Assignment 5
*/

import java.util.Scanner;

public class A5_0 
{
    static double monumentWeight(double width, double height) {
        return ((width * height) * (height / 3));
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double userWidth, userHeight;

        System.out.print("Enter the width of the pyramid: ");
        userWidth = scnr.nextDouble();

        System.out.print("Enter the height of the pyramid: ");
        userHeight = scnr.nextDouble();

        System.out.println("The weight of your monument is: " + monumentWeight(userWidth, userHeight));
        
        scnr.close();
    }
}
package com.gradescope.Assignment5;

/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: Assignment 5
*/

import java.util.Scanner;

public class A5_2 
{
    static String translateToL337(char input) {
        String output = "";
        switch (input) {
            case 'a':
                output = "4";
                break;
            case 'b':
                output = "B";
                break;
            case 'c':
                output = "(";
                break;
            case 'd':
                output = "D";
                break;
            case 'e':
                output = "3";
                break;
            case 'f':
                output = "Ph";
                break;
            case 'g':
                output = "9";
                break;
            case 'h':
                output = "|-|";
                break;
            case 'i':
                output = "1";
                break;
            case 'j':
                output = "j";
                break;
            case 'k':
                output = "|<";
                break;
            case 'l':
                output = "L";
                break;
            case 'm':
                output = "/\\\\/\\\\";
                break;
            case 'n':
                output = "|\\\\|";
                break;
            case 'o':
                output = "0";
                break;
            case 'p':
                output = "P";
                break;
            case 'q':
                output = "Q";
                break;
            case 'r':
                output = "R";
                break;
            case 's':
                output = "$";
                break;
            case 't':
                output = "7";
                break;
            case 'u':
                output = "U";
                break;
            case 'v':
                output = "\\\\/";
                break;
            case 'w':
                output = "\\\\//\\\\//";
                break;
            case 'x':
                output = "><";
                break;
            case 'y':
                output = "\'/";
                break;
            case 'z':
                output = "Z";
                break;
            case ' ':
                output = " ";
                break;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userInput;

        System.out.print("Enter a string: ");
        userInput = scnr.nextLine();
        
        System.out.println();

        for (int i = 0; i < userInput.length(); i++) {
            char thisLetter = userInput.charAt(i);
            System.out.print(translateToL337(thisLetter));
        }

        scnr.close();
    }
}
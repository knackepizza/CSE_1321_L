/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class BurgertownProfit {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		float cost, price, tax, netProfit, profit;
		int amount;
		
		System.out.print("Enter the cost to make a meal: ");
		cost = scnr.nextFloat();
		
		System.out.print("How much will you sell the meal for: ");
		price = scnr.nextFloat();
		
		System.out.print("Enter how many you think you will sell: ");
		amount = scnr.nextInt();
		
		System.out.print("Enter the percent to return to corporate: ");
		tax = scnr.nextFloat();
		
		netProfit = ((price - cost) * amount);
		profit = (netProfit - (netProfit * tax));
		
		System.out.print("This campaign wil make $");
		System.out.printf("%.0f", profit);
		System.out.println(" profit.");
		
		scnr.close();
	}
}

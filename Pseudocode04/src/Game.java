/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: Assignment 4
*/

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int heroHP, heroDMG, bossHP, bossDMG, round = 0;
        boolean playAgain = true;

        System.out.print("Enter your HP: ");
        heroHP = scnr.nextInt();
        System.out.print("Enter your DMG: ");
        heroDMG = scnr.nextInt();
        System.out.print("Enter boss HP: ");
        bossHP = scnr.nextInt();
        System.out.print("Enter boss DMG: ");
        bossDMG = scnr.nextInt();

        while (playAgain == true) {
            round++;
            System.out.println("==== ROUND " + round + " ====");
            game:
            while (heroHP > 0 || bossHP > 0) {
                double playerStrike = (1 * Math.random() + heroDMG);
                double bossStrike = (1 * Math.random() + bossDMG);

                System.out.println("Hero attacks for: " + playerStrike);
                bossHP -= playerStrike;
                if (bossHP <= 0) {
                    System.out.println("Boss died.");
                    break game;
                }
                System.out.println("Monster has " + bossHP + " HP left");

                System.out.println("Boss attacks for: " + bossStrike);
                heroHP -= bossStrike;
                if (heroHP <= 0) {
                    System.out.println("Hero died.");
                    break game;
                }
                System.out.println("Hero has " + heroHP + " HP left");
            }
            System.out.print("Want to play again?");
            playAgain = scnr.nextBoolean();
        }
        scnr.close();
    }
}
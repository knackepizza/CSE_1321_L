import java.util.Scanner;
public class Mentos {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String food, drink;

        System.out.print("Enter your food: ");
        food = scnr.nextLine();

        System.out.print("Enter your drink: ");
        drink = scnr.nextLine();

        // wtf its backwards
        if ((food == "mentos") & (drink == "dietcoke")) {
            System.out.println("Panda, you are free to eat!");
        } else {
            System.out.println("Don't do it! You won't live!");
        }

        System.out.println("\n" + "food: " + food + " drink: " + drink);
        scnr.close();
    }
}
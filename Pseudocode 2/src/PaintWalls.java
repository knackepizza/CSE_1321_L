import java.util.Scanner;
public class PaintWalls {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int walls, height, width;
        String color;
        double gallons;

        System.out.print("How many walls would you like painted? ");
        walls = scnr.nextInt();

        System.out.print("What is the average height? ");
        height = scnr.nextInt();

        System.out.print("What is the average width? ");
        width = scnr.nextInt();

        // taking the \n character
        scnr.nextLine();
        
        System.out.print("What color paint do you want? ");
        color = scnr.nextLine();

        
        System.out.println("Painted " + (walls * (width * height)) + "ft^2 of wall the color " + color);
        gallons = ((walls * (width * height)) / 400.0);
        System.out.println("It took " + gallons + " gallons of paint");

        scnr.close();
    }
}
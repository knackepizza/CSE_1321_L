import java.util.Scanner;

public class AssignGrades {

    static char letterGradeOf(int grade) {
        if (grade <= 100 && grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int classSize;

        System.out.print("How many people in the class? ");
        classSize = scnr.nextInt();

        int[] grades = new int[classSize];

        for (int i = 0; i < classSize; i++) {
            System.out.print("Enter the grade for Student #" + (i + 1) + ": ");
            grades[i] = scnr.nextInt();
        }

        System.out.println("\nClass Size: \t" + classSize);
        System.out.print("Entered grades: ");
        for (int i = 0; i < classSize; i++) {
            System.out.print(grades[i]);
            if (i < (classSize - 1)) {
                System.out.print(", ");
            } else {
                System.out.println("\n");
            }
        }
        for (int i = 0; i < classSize; i++) {
            // Spaced out for soft-wrap
            System.out.println("Student " + i 
                                + " score is " + grades[i] 
                                + " and grade is " 
                                + letterGradeOf(grades[i]));
        }

        scnr.close();
    }
}
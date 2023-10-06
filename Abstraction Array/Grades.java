import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Grades {
    double[] StudentGrades = new double[5];

    abstract void GetAverage();
    abstract void GetMaxVal();
    abstract void GetMinVal();

    void setGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grades:");

        for (int i = 0; i < 5; i++) {
            boolean validInput = false;
            double grade = 0;

            while (!validInput) {
                System.out.print("Enter grade #" + (i + 1) + ": ");

                try {
                    grade = sc.nextDouble();
                    // Check if the grade is within the valid range (59 to 100)
                    if (grade >= 59 && grade <= 100) {
                        validInput = true;
                    } else {
                        System.out.println("Input error: Invalid Grade.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input error: Please enter a valid numeric value.");
                    sc.nextLine(); // Consume the invalid input
                }
            }
            StudentGrades[i] = grade;
        }

        // Display the entered grades
        System.out.println("\nYou entered the following grades:");
        for (double i : StudentGrades) {
            System.out.printf("Grade #" + (i + 1) + ": %.2f%n", StudentGrades[i]);
        }
    }
}
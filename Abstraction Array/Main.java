import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Grades c = new Calculate();
        c.setGrades();

        while (true) {
            System.out.println("\nWhat do you want to do? \n[1] GET AVERAGE \n[2] GET HIGHEST GRADE \n[3] GET LOWEST GRADE \n[4] EXIT");
            boolean isValid = false;
            while (!isValid) {
                try {
                    System.out.print("Input here: ");
                    int ans = sc.nextInt();
                    if (ans == 1) {
                        c.GetAverage();
                        isValid = true;
                    } else if (ans == 2) {
                        c.GetMaxVal();
                        isValid = true;
                    } else if (ans == 3) {
                        c.GetMinVal();
                        isValid = true;
                    } else if (ans == 4) {
                        System.out.println("Exiting the program....");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid choice");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input error: Please enter a valid numeric value.");
                    sc.nextLine();
                }
            }
         }  
        }
       
    }


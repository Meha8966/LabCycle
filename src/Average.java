import java.util.Scanner;   // Import Scanner class

public class Average {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare variables
        int num1, num2, num3;
        double average;

        // Read three numbers
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        num3 = sc.nextInt();

        // Calculate average
        // Divide by 3 (not 0) to avoid division by zero
        average = (num1 + num2 + num3) / 3.0;

        // Display the average
        System.out.println("Average = " + average);

        // Close Scanner
        sc.close();
    }
}
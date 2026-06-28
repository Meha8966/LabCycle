import java.util.Scanner;   // Import Scanner class for user input

public class SimpleInterest {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare variables
        double principal, rate, time;
        double simpleInterest, amount;

        // Read principal amount
        System.out.print("Principal: ");
        principal = sc.nextDouble();

        // Read rate of interest
        System.out.print("Rate: ");
        rate = sc.nextDouble();

        // Read time period
        System.out.print("Time: ");
        time = sc.nextDouble();

        // Calculate simple interest
        simpleInterest = (principal * rate * time) / 100;

        // Calculate total amount
        amount = principal + simpleInterest;

        // Display the results
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Amount = " + amount);

        // Close the Scanner object
        sc.close();
    }
}
// Program to create calculator using switch

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read choice and numbers
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        int result;

        // Perform operation
        switch(choice) {
            case 1:
                result = a + b;
                break;

            case 2:
                result = a - b;
                break;

            case 3:
                result = a * b;
                break;

            case 4:
                result = a / b;
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        // Display result
        System.out.println("Result = " + result);

        sc.close();
    }
}
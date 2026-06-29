// Program to perform arithmetic operations

import java.util.Scanner;

class Arithmetic{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two numbers
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        // Perform operations
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        sc.close();
    }
}
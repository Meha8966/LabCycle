// Program to swap two numbers using temporary variable

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read numbers
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        // Before swap
        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Swap using temporary variable
        int temp = a;
        a = b;
        b = temp;

        // After swap
        System.out.println("\nAfter Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}
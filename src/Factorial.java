//17/6/26

import java.util.Scanner;

class Factorial {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("Factorial = " + result);

        sc.close();
    }
}
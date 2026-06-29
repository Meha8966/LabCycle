// Program to find sum of digits using loop

import java.util.Scanner;

class SumDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number
        System.out.print("Number = ");
        int num = sc.nextInt();

        int sum = 0;

        // Find sum of digits
        while(num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        // Display result
        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
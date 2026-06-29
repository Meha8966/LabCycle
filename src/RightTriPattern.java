// Program to print right triangle pattern

import java.util.Scanner;

class RightTriPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read rows
        System.out.print("Rows = ");
        int rows = sc.nextInt();

        // Nested loops for pattern
        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
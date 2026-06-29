// Program to check even or odd using modulus operator

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number
        System.out.print("Number = ");
        int n = sc.nextInt();

        // Check even or odd
        if(n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");

        sc.close();
    }
}
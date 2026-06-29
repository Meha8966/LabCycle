// Program to check whether a number is prime

import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number
        System.out.print("Number = ");
        int n = sc.nextInt();

        int count = 0;

        // Check factors
        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                count++;
        }

        // Display result
        if(count == 2)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");

        sc.close();
    }
}
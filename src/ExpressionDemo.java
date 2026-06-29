// Program to evaluate expression

import java.util.Scanner;

class ExpressionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read values
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        System.out.print("d = ");
        int d = sc.nextInt();

        System.out.print("e = ");
        int e = sc.nextInt();

        // Expression calculation
        int result = a + b * c - d / e;

        // Display result
        System.out.println("Result = " + result);

        sc.close();
    }
}
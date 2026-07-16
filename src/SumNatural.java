import java.util.Scanner;
//17/6/26 -CO2
class SumNatural {

    // Recursive method to find sum of natural numbers
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = sum(n);

        System.out.println("Sum = " + result);

        sc.close();
    }
}
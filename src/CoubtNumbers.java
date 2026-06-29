// Program to count positive, negative and zero values

import java.util.Scanner;

class CountNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("N = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Read array elements
        System.out.println("Array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positive = 0, negative = 0, zero = 0;

        // Count values
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0)
                positive++;
            else if(arr[i] < 0)
                negative++;
            else
                zero++;
        }

        // Display result
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);

        sc.close();
    }
}
// Program to find largest element in an array

import java.util.Scanner;

class LargestArray {
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

        // Assume first element is largest
        int largest = arr[0];

        // Find largest value
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Display result
        System.out.println("Largest element = " + largest);

        sc.close();
    }
}
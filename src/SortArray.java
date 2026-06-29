// Program to sort array in ascending order

import java.util.Scanner;

class SortArray {
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

        // Sorting using loop
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
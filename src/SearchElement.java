// Program to search an element in an array

public class SearchElement {
    public static void main(String[] args) {

        // Declare and initialize array
        int arr[] = {10, 20, 30, 40, 50};

        // Element to search
        int search = 30;

        // Variable to store position
        int position = -1;

        // Loop through array to find element
        for (int i = 0; i < arr.length; i++) {

            // Check if current element matches search value
            if (arr[i] == search) {
                position = i + 1;   // Convert index to position
                break;
            }
        }

        // Display result
        if (position != -1) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
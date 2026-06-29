// Program to find the largest among three numbers using if-else

public class Largestofthree {
    public static void main(String[] args) {

        // Declare and initialize three numbers
        int A = 25;
        int B = 40;
        int C = 15;

        // Check which number is the largest
        if (A >= B && A >= C) {
            System.out.println("Largest = " + A);
        }
        else if (B >= A && B >= C) {
            System.out.println("Largest = " + B);
        }
        else {
            System.out.println("Largest = " + C);
        }
    }
}
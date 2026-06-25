// Program to display the multiplication table of a number

public class MultiplicationTable {
    public static void main(String[] args) {

        // Declare and initialize the number
        int number = 7;

        // Loop from 1 to 10 and display the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
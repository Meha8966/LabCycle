import java.util.Scanner;   // Import Scanner class for user input

public class StudentInfo {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Declare variables to store student details
        String name;
        int rollNo;
        String course;
        double percentage;

        // Read student name
        System.out.print("Name: ");
        name = sc.nextLine();

        // Read roll number
        System.out.print("Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        // Read course name
        System.out.print("Course: ");
        course = sc.nextLine();

        // Read percentage
        System.out.print("Percentage: ");
        percentage = sc.nextDouble();

        // Display student details
        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

        // Close the Scanner object
        sc.close();
    }
}
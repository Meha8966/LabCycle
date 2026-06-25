// Student Grade Calculator Program
// This program reads marks and displays the corresponding grade.

public class StudentGrade{
    public static void main(String[] args) {

        // Store the marks obtained by the student
        int marks = 85;

        // Check the marks range and assign grade
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade = A");
        }
        else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade = B");
        }
        else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade = C");
        }
        else {
            System.out.println("Grade = D");
        }
    }
}
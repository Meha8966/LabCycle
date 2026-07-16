import java.util.Scanner;

class CircleArea {
    public static void main(String[] args) {

        // Declaring PI as a constant using final keyword
        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // Calculating area of circle
        double area = PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.printf("Area = %.2f", area);

        sc.close();
    }
}
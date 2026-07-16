// 17/6/26 -CO2

class Circle {
    double radius;
    double area;

    // Method to calculate area and return Circle object
    static Circle calculateArea(double r) {
        Circle c = new Circle();
        c.radius = r;
        c.area = 3.14159 * r * r;
        return c;
    }

    public static void main(String[] args) {

        Circle c = calculateArea(7); // Calling method

        System.out.println("Radius = " + c.radius);
        System.out.printf("Area = %.2f", c.area);
    }
}
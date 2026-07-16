// 18/6/26 co2

class Rectangle {

    int length, breadth;

    // Default Constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(8, 5);

        System.out.println("Rectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());
    }
}
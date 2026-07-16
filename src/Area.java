class Area {

    // Method to calculate square area
    int area(int side) {
        return side * side;
    }

    // Method to calculate rectangle area
    int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Square = " + a.area(6));
        System.out.println("Area of Rectangle = " + a.area(8, 4));
    }
}
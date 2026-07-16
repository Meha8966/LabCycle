// 17/6/26 CO2

class Box {
    int length, width, height;

    // Constructor
    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate volume
    int volume() {
        return length * width * height;
    }

    // Method to compare two boxes
    static void largerBox(Box b1, Box b2) {
        if (b1.volume() > b2.volume())
            System.out.println("Larger Box Volume = " + b1.volume());
        else
            System.out.println("Larger Box Volume = " + b2.volume());
    }

    public static void main(String[] args) {

        Box box1 = new Box(3, 4, 5);
        Box box2 = new Box(5, 4, 6);

        largerBox(box1, box2); // Passing objects
    }
}
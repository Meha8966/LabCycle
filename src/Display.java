// 17/6/26-CO2

class Display {

    // Display integer
    void display(int n) {
        System.out.println("Integer : " + n);
    }

    // Display double
    void display(double d) {
        System.out.println("Double : " + d);
    }

    // Display string
    void display(String s) {
        System.out.println("String : " + s);
    }

    public static void main(String[] args) {

        Display obj = new Display();

        obj.display(10);
        obj.display(25.6);
        obj.display("Java");
    }
}
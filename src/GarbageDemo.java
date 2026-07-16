// 17/6/26 CO2

class GarbageDemo {

    // finalize method
    protected void finalize() {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {

        GarbageDemo obj = new GarbageDemo();

        System.out.println("Object Created");

        obj = null; // Object eligible for garbage collection

        System.gc(); // Request garbage collector
    }
}
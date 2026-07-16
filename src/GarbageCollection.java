// 18/6/26 CO2

class GarbageCollection {

    // finalize method
    protected void finalize() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {

        // Creating multiple objects
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();

        System.out.println("Object Created");

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}
// Program to show different data types in Java

class DataType{
    public static void main(String[] args) {

        // Store values
        byte b = 10;
        short s = 1000;
        int i = 100;
        long l = 100000;
        float f = 25.5f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        // Display values
        System.out.println("Integer value : " + i);
        System.out.println("Long value    : " + l);
        System.out.println("Float value   : " + f);
        System.out.println("Double value  : " + d);
        System.out.println("Character     : " + c);
        System.out.println("Boolean       : " + bool);

        // Memory range
        System.out.println("\nMemory Range:");
        System.out.println("Byte  : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int   : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long  : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    }
}
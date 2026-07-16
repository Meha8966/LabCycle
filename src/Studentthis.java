// 18/6/26 co2

class Studentthis {

    String name;
    int age;

    // Default Constructor
    Student() {
        this("Manu", 21); // Calling parameterized constructor
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Name : " + s.name);
        System.out.println("Age : " + s.age);
    }
}
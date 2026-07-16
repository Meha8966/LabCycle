//CO2 17/7/26

class Student {

    // Private data members
    private String name;
    private int age;

    // Public setter method to set values
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Public getter method to get values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class AccessControl {
    public static void main(String[] args) {

        Student s = new Student();

        // Setting values using setter methods
        s.setName("Maya");
        s.setAge(19);

        // Accessing values using getter methods
        System.out.println("Student Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}
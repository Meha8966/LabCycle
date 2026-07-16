// 18/6/26 co2

class Employee {

    String name;
    double salary;

    // Parameterized Constructor
    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    // Method to display details
    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee("Rahul", 35000);

        e.display();
    }
}
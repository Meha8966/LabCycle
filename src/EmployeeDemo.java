//25/06/26 CO3

public class EmployeeDemo {
    public static void main(String[] args) {

        Manager m = new Manager(101, "Arun", 50000, "Sales", 15000);

        m.displayEmployee();
        m.displayManager();
    }
}

// Parent class
class Employee {

    int employeeId;
    String employeeName;
    double salary;

    // Constructor
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Display employee details
    void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("ID         : " + employeeId);
        System.out.println("Name       : " + employeeName);
        System.out.println("Salary     : " + salary);
        System.out.println();
    }
}

// Child class
class Manager extends Employee {

    String department;
    double bonus;

    // Constructor
    Manager(int employeeId, String employeeName, double salary,
            String department, double bonus) {

        super(employeeId, employeeName, salary);

        this.department = department;
        this.bonus = bonus;
    }

    // Display manager details
    void displayManager() {
        System.out.println("Manager Details");
        System.out.println("---------------");
        System.out.println("Department : " + department);
        System.out.println("Bonus      : " + bonus);
    }
}
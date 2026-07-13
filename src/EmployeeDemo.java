class EmployeeBase {
    void calculateSalary() {
        System.out.println("Employee Salary");
    }
}

class Manager extends EmployeeBase {
    @Override
    void calculateSalary() {
        System.out.println("Manager Salary : 4000");
    }
}

class Developer extends EmployeeBase {
    @Override
    void calculateSalary() {
        System.out.println("Developer Salary : 70000");
    }
}

class Intern extends EmployeeBase {
    @Override
    void calculateSalary() {
        System.out.println("Intern Salary : 5000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        EmployeeBase emp;

        emp = new Manager();
        emp.calculateSalary();

        emp = new Developer();
        emp.calculateSalary();

        emp = new Intern();
        emp.calculateSalary();
    }
}
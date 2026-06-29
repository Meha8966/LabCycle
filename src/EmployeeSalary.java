// Program to calculate employee salary

import java.util.Scanner;

class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read basic salary
        System.out.print("Basic Salary: ");
        double basic = sc.nextDouble();

        // Calculate DA and HRA
        double da = basic * 10 / 100;
        double hra = basic * 15 / 100;

        // Calculate gross salary
        double gross = basic + da + hra;

        // Display result
        System.out.println("DA = " + (int)da);
        System.out.println("HRA = " + (int)hra);
        System.out.println("Gross Salary = " + (int)gross);

        sc.close();
    }
}
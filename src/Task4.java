// 09/7/26  CO3

// Superclass
class Vehicle {

    // Public member
    public String company;

    // Protected member
    protected String model;

    // Default (package-private) member
    String fuelType;

    // Constructor
    public Vehicle(String company, String model, String fuelType) {
        this.company = company;
        this.model = model;
        this.fuelType = fuelType;
    }
}

// Subclass
class Car extends Vehicle {

    // Constructor
    public Car(String company, String model, String fuelType) {
        super(company, model, fuelType);
    }

    // Display inherited members
    public void displayCar() {
        System.out.println("Vehicle Information");
        System.out.println("-------------------");
        System.out.println("Company   : " + company);
        System.out.println("Model     : " + model);
        System.out.println("Fuel Type : " + fuelType);
    }
}

// Main class
public class Task4 {

    // Method to display accessible members
    public static void displayVehicle(Car car) {
        System.out.println("\nCar object created successfully.");
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Innova", "Diesel");

        car.displayCar();
        displayVehicle(car);
    }
}
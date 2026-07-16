//CO2 16/7/26

import java.util.Scanner;

class TemperatureConverter {

    // Static method to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        // Calling static method
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
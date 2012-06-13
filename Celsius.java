package conversion;
import java.util.Scanner;


public class Celsius {
    void ConvertCelsius() {
	Scanner scnr = new Scanner(System.in);

	double celsius, fahrenheit;

	System.out.println("Enter the temperature in Celsius: ");
	celsius = scnr.nextDouble();

	//Here is the formula:
	fahrenheit = (celsius * 9/5) + 32;

	System.out.println("\nTemperature in Celsius:");
	System.out.println(celsius);
	System.out.println("Temperature in Fahrenheit:");
	System.out.println(fahrenheit);
    }
    void ConvertFahrenheit() {
	Scanner scnr = new Scanner(System.in);

	double celsius, fahrenheit;

	System.out.println("Enter the temperature in Fahrenheit: ");
	fahrenheit = scnr.nextDouble();

	//Here is the formula:
	celsius = (fahrenheit - 32) * 5/9;

	System.out.println("\nTemperature in Fahrenheit:");
	System.out.println(fahrenheit);
	System.out.println("Temperature in Celsius:");
	System.out.println(celsius);
    }
}

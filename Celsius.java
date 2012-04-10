package conversion;
import java.util.Scanner;

public class Celsius {
    void Process() {
        Scanner scnr = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
        System.out.println("Enter the temperature in Celsius");
        celsius = scnr.nextDouble();

        fahrenheit = celsius * 9/5 + 32;

        System.out.println("\nTemperature in Celsiur");
        System.out.println(celsius);
        System.out.println("Temperature in Fahrenheit");
        System.out.println(fahrenheit);
   
    }
}
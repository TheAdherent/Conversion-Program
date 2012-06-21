package conversion;
import java.util.Scanner;

public class Converter {
	Scanner scnr = new Scanner(System.in);
    	String desiredTempScale = new String();
	double celsius, fahrenheit, kelvin;
	
    void FromCelsius() {
	System.out.println("What would you like to convert to?");
	System.out.println("Type k for Kelvin and f for Fahrenheit.");
	desiredTempScale = scnr.next("[\\s]*[a-zA-Z]");

	if(desiredTempScale.equalsIgnoreCase("f")) 
	{
	    System.out.println("Enter the temperature in Celsius: ");
	    celsius = scnr.nextDouble();
	    fahrenheit = (celsius * 9/5) + 32;
	    System.out.println("\nTemperature in Celsius:");
	    System.out.println(celsius);
	    System.out.println("Temperature in Fahrenheit:");
	    System.out.println(fahrenheit);
	}
	if(desiredTempScale.equalsIgnoreCase("k"))
	{
	    System.out.println("Enter the temperature in Celsius: ");
	    celsius = scnr.nextDouble();
	    kelvin = (celsius + 273.15);
	    System.out.println("\nTemperature in Celsius:");
	    System.out.println(celsius);
	    System.out.println("Temperature in Kelvin:");
	    System.out.println(kelvin);
	}    
	else if (desiredTempScale.equalsIgnoreCase("^[ckf]")) 
	{
	    System.out.println("Sorry, input not recognized.");
	}
    }
    
    void FromKelvin() {
	System.out.println("What would you like to convert to?");
	System.out.println("Type f for Fahrenheit and c for Celsius.");
	desiredTempScale = scnr.next("[\\s]*[a-zA-Z]");

	if(desiredTempScale.equalsIgnoreCase("f")) 
	{
	    System.out.println("Enter the temperature in Kelvin: ");
	    kelvin = scnr.nextDouble();
	    fahrenheit = ((9/5) * (kelvin - 273.15) + 32);
	    System.out.println("\nTemperature in Kelvin:");
	    System.out.println(kelvin);
	    System.out.println("Temperature in Fahrenheit:");
	    System.out.println(fahrenheit);
	}
	if(desiredTempScale.equalsIgnoreCase("c"))
	{
	    System.out.println("Enter the temperature in Kelvin: ");
	    kelvin = scnr.nextDouble();
	    celsius = (kelvin + 273.15);
	    System.out.println("\nTemperature in Kelvin:");
	    System.out.println(kelvin);
	    System.out.println("Temperature in Celsius:");
	    System.out.println(celsius);
	}
	else if (desiredTempScale.equalsIgnoreCase("^[ckf]")) 
	{
	    System.out.println("Sorry, input not recognized.");
	}
    }
    
    void FromFahrenheit() {
	System.out.println("What would you like to convert to?");
	System.out.println("Type k for Kelvin and c for Celsius.");
	desiredTempScale = scnr.next("[\\s]*[a-zA-Z]");

	if(desiredTempScale.equalsIgnoreCase("c"))
	{
	    System.out.println("Enter the temperature in Fahrenheit: ");
	    fahrenheit = scnr.nextDouble();
	    celsius = (fahrenheit - 32) * 5/9;
	    System.out.println("\nTemperature in Fahrenheit:");
	    System.out.println(fahrenheit);
	    System.out.println("Temperature in Celsius:");
	    System.out.println(celsius);
	}
	if(desiredTempScale.equalsIgnoreCase("k"))
	{
	    System.out.println("Enter the temperature in Fahrenheit: ");
	    fahrenheit = scnr.nextDouble();
	    kelvin = ((fahrenheit + 459.67) * 5/9);
	    System.out.println("\nTemperature in Fahrenheit:");
	    System.out.println(fahrenheit);
	    System.out.println("Temperature in Kelvin:");
	    System.out.println(kelvin);
	}
	else if (desiredTempScale.equalsIgnoreCase("[a-bA-B[^ckf]]")) 
	{
	    System.out.println("Sorry, input not recognized.");
	}
    }
}

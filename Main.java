/*
 * Main
 *
 * Version 0.1
 *
 */

package conversion;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	Converter ctof = new Converter();
	String input = new String();

	System.out.println("What would you like to convert from?");
	System.out.println("Type f for Fahrenheit, c for Celsius, and k for Kelvin");
	input = scnr.next("[\\s]*[a-zA-Z]");
	
	if(input.equalsIgnoreCase("c")) {ctof.FromCelsius();}
	if(input.equalsIgnoreCase("k")) {ctof.FromKelvin();}
	if(input.equalsIgnoreCase("f")) {ctof.FromFahrenheit();}

	else if (input.equalsIgnoreCase("[a-bA-B[^ckf]]")) 
	{
	    System.out.println("Sorry, input not recognized.");
	}
    }
}
/*
 * Conversion
 *
 * Version 0.1
 *
 */

package conversion;
import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	Celsius ctof = new Celsius();
	String choice = new String();

	System.out.println("What would you like to convert?");
	System.out.println("Type f for Fahrenheit and c for Celsius.");
	choice = scnr.next();

	if(choice.equals("([\\s]*)([c]+)(?i)")) {ctof.ConvertCelsius();}

	if(choice.equals("([\\s]*)([f]+)(?i)")) {ctof.ConvertFahrenheit();}

	else {System.out.println("Sorry, input not recognized.");}
    }
}
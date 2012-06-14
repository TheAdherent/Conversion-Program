/*
 * Conversion
 *
 * Version 0.1
 *
 */

package conversion;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	Celsius ctof = new Celsius();
	String choice = "^[\\s]*[fc]{1}$";

	System.out.println("What would you like to convert?");
	System.out.println("Type f for Fahrenheit and c for Celsius.");
	choice = scnr.next();

	if(choice.equals("c") || choice.equals("C")) {ctof.ConvertCelsius();}

	if(choice.equals("f") || choice.equals("F")) {ctof.ConvertFahrenheit();}

	else {System.out.println("Sorry, input not recognized.");}
    }
}
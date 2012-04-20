package conversion;
import java.util.Scanner;
public class Conversion {
    
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
	Celsius ctof = new Celsius();
	String choice;
        
	System.out.println("Would you like to convert Celsius to Fahrenheit? yes/no");
	choice = scnr.next();
        
	if (choice.equals("yes")) ctof.Process();
	if (choice.equals("no")) System.out.println("Well, fine then!");
    }
}
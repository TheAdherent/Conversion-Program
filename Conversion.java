package conversion;
import java.util.Scanner;
public class Conversion {

    enum whichtoConvert {
    CelsiustoFahrenheit
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Celsius ctof = new Celsius();
        boolean choice = true;
        System.out.println("Would you like to convert Celsius to Fahrenheit? If so, type true.");
        choice = scnr.nextBoolean();
        if (choice == true) ctof.Process();
    }
}

package temperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celcius;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius: ");
        celcius = scan.nextDouble();

        System.out.println(celcius + " Celsius is " + new ConvertToKelvin().convert(celcius) + " in Kelvin");


        System.out.println(celcius + " Celsius14 is " + new ConverterToFahrenheit().convert(celcius) + " in Fahrenheit");


    }//main
}//class

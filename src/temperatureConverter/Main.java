package temperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius: ");
        celsius = scan.nextDouble();

        System.out.println(celsius + " Celsius is " + new ConvertToKelvin().convert(celsius) + " in Kelvin");


        System.out.println(celsius + " Celsius14 is " + new ConverterToFahrenheit().convert(celsius) + " in Fahrenheit");


    }//main
}//class

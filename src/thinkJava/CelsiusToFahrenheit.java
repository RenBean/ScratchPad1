package thinkJava;

import java.util.Scanner;

/**
 * Created by Ari on 7/22/16.
 */
public class CelsiusToFahrenheit {
    public static void main(String []args){
        double userInputCelsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);
        System.out.println("Convert: Celsius to Fahrenheit\nEnter temperature in celsius:\n");
        userInputCelsius = in.nextDouble();

        fahrenheit = (userInputCelsius*9)/5 +32;

        System.out.printf("%.1f C = %.1f F",userInputCelsius, fahrenheit);

    }
}

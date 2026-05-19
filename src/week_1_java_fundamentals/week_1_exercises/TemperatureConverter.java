package week_1_java_fundamentals.week_1_exercises;

// PROGRAM:
// Convert Celsius to Fahrenheit
// Formula: F = (C x 9/5) + 32
// Ask user to enter Celsius, print Fahrenheit result

import java.util.Scanner;   // import Scanner class for user input

public class TemperatureConverter {
    public static void main(String[] args) {

        // SCANNER OBJECT:
        // used to read keyword input
        Scanner scanner = new Scanner(System.in);

        // PROGRAM TITLE
        System.out.println("Convert Celsius to Fahrenheit");

        // USER INPUT SECTION

        // ask user for Celsius temperature value
        System.out.println("What is Celsius degree?");

        // read integer temperature value
        int celsius = scanner.nextInt();
        
        // CONVERSION FORMULA

        // convert Celsius to Fahrenheit
        int fahrenheit = (celsius * 9 / 5) + 32;

        // print Fahrenheit temperature
        System.out.println("Fahrenheit is: " + fahrenheit);

        // close scanner to free system resources
        scanner.close();
    }
}

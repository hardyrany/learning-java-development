package week_1_java_fundamentals.week_1_exercises;

// Convert Celsius to Fahrenheit
// Formula: F = (C x 9/5) + 32
// Ask user to enter Celsius, print Fahrenheit result

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Convert Celsius to Fahrenheit");
        System.out.println("What is Celsius degree?");
        int celsius = scanner.nextInt();
        int fahrenheit = celsius * 9/5 + 32;

        System.out.println("Fahrenheit is: " + fahrenheit);

        scanner.close();
    }
}

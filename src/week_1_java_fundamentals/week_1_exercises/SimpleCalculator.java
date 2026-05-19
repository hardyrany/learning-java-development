package week_1_java_fundamentals.week_1_exercises;

// PROGRAM:
// This program asks the user for two numbers
// and performs basic arithmetic operations
// Create a program that:
// 1. Asks user for two numbers
// 2. Displays their sum, difference, product, and quotient

import java.util.Scanner;   // import Scanner class for user input

public class SimpleCalculator {
    public static void main(String[] args) {

        // SCANNER OBJECT:
        // used to read keyboard input
        Scanner scanner = new Scanner(System.in);

        // PROGRAM TITLE
        System.out.println("Simple Calculator");

        // ask user for first number
        System.out.println("Add first number: ");

        // read integer input
        int firstNumber = scanner.nextInt();

        // ask user for secund input
        System.out.println("Add secund number: ");

        // read integer input
        int secundNumber = scanner.nextInt();

        // ARITHMETIC OPERATIONS

        // addition
        System.out.println("Sum: " + (firstNumber + secundNumber));

        // subtraction
        System.out.println("Subtraction: " + (firstNumber - secundNumber));

        // multiplication
        System.out.println("Multiplication: " + (firstNumber * secundNumber));
        
        // division
        // integer division removes decimal part
        System.out.println("Division: " + (firstNumber / secundNumber));

        // close scanner to free resources
        scanner.close();
    }
}

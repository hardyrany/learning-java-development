package week_1_java_fundamentals.week_1_exercises;

// Create a program that:
// 1. Asks user for two numbers
// 2. Displays their sum, difference, product, and quotient

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Add first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Add secund number: ");
        int secundNumber = scanner.nextInt();

        System.out.println("Sum: " + (firstNumber + secundNumber));
        System.out.println("Subtraction: " + (firstNumber - secundNumber));
        System.out.println("Multiplication: " + (firstNumber * secundNumber));
        System.out.println("Division: " + (firstNumber / secundNumber));

        scanner.close();
    }
}

package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner; // import Scanner class for user input

public class TernaryV2 {
    public static void main(String[] args) {

        // SCANNER OBJECT:
        // used to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // INPUT SECTION:
        // ask user for age
        System.out.println("How old are you?");

        // read integer value for age variable
        int age = scanner.nextInt();

        // TERNARY OPERATOR:
        // shortcut of if-else statement

        // (condition) ? valueIfTrue : valueIfFalse

        // checks if user is adult or minor
        String result = (age >= 18) ? "Adult" : "Minor";

        // prints the the value
        System.out.println(result);

        // VARIABLES:
        int a = 18, b = 100;

        // TERNARY OPERATOR (MIN VALUE):
        // checks which number is smaller
        int min = (a < b) ? a : b;

        // TERNARY OPERATOR (MAX VALUE):
        // checks which number is greater
        int max = (a > b) ? a : b;

        // OUTPUT SECTION
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // close scanner to free system resources
        scanner.close();
    }
}

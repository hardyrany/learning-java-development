package week_2_control_flow.week_2_exercises;

// Ask user for:
//   - Two numbers
//   - An operator (+, -, *, /)
// Use switch to perform the correct operation
// Print the result

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter a secund number: ");
        double  secundNumber = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secundNumber;  
                System.out.println("Result: " + result);
                break;
            case '-':
                result = firstNumber - secundNumber;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = firstNumber * secundNumber;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (secundNumber == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    result = firstNumber / secundNumber;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}

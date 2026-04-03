package week_2_control_flow.week_2_exercises;

import java.util.Scanner;

// Ask user to enter a number
// Print whether it is Even or Odd
// Hint: use % (modulus) operator

public class EvenOddChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        scanner.close();
    }
}

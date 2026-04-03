package week_2_control_flow.week_2_exercises;

// Set a secret number (e.g. 7)
// Ask user to keep guessing using a while loop
// Give hints: "Too High" or "Too Low"
// Congratulate when correct
// Count and display number of attempts

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secret = 10;
        int guess = 0;

        while (guess != secret) {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();

        if (guess < secret) {
            System.out.println("Too low!");
        } else if (guess > secret) {
            System.out.println("Too high!");
        }
        }
        System.out.println("Correct! The number was " + secret);

        scanner.close();
    }
}

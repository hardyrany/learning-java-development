package week_2_control_flow.day_4_while_dowhile_loop;

import java.util.Scanner;

public class GuessingNumberGame {

    public static void guessingNumberGame() {

        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = 1 + (int)(100 * Math.random());

        // Number of attempts
        int K = 5;

        System.out.println(" A number is chosen between 1 and 100.");
        System.out.println("You have " + K + " attempts to guess the correct number.");

        // Loop for K attempts
        for (int i = 0; i < K; i++) {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();

            // Check conditions
            if (guess == number) {
                System.out.println(" Congratulations! You guessed the correct number. ");
                scanner.close();

                // Exit function if guessed correctly
                return;
            } else if ( guess < number) {
                System.out.println(" The number is greater than " + guess);
            } else {
                System.out.println(" The number is less than " + guess);    
            }
        }

        // If the user runs out attempts
        System.out.println("You've exhausted all attempts. The correct number was: " + number);

        scanner.close();
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}

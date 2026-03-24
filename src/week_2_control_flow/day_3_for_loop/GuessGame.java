package week_2_control_flow.day_3_for_loop;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int secret = 42;
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

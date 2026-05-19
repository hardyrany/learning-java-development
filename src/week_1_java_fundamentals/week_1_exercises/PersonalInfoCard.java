package week_1_java_fundamentals.week_1_exercises;

// PROGRAM:

// This program asks the user personal information
// and prints its as a formatted info card

// Create a program that:
// 1. Asks for name, age, and city
// 2. Prints a formatted info card like:
// ====================================
// Name: Alice
// Age: 25
// City:cNew York
// ====================================

import java.util.Scanner; // import Scanner class for user input

public class PersonalInfoCard {
    public static void main(String[] args) {

        // SCANNER OBJECT:
        // used to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // USER INPUT:

        // ask user for name
        System.out.println("What is your name?");

        // nextLine() reads full text input
        String name = scanner.nextLine();

        // ask user for input
        System.out.println("How old are you?");

        // nextInt() reads integer input numbers
        int age = scanner.nextInt();

        // IMPORTANT:
        // nextInt() leaves the ENTER key (\n) in memory buffer
        // nextLine() below would red that empty ENTER instead of city name
        // so we clear the leftover ENTER using scanner.nextLine()
        /*
         * without scanner.nextLine():
         * input buffer bug -> Scanner buffer issue
         * Rules: after use
         * nextInt()
         * nextDouble()
         * nextFloat()
         * before - nextLine()
         * always use -> scanner.nextLine();
         * To clear the buffer
         */
        scanner.nextLine();

        // ask user for city
        System.out.println("What city do you live in?");

        // reads full line text for city
        String city = scanner.nextLine();

        // OUTPUT SECTION

        // print empty line for spacing
        System.out.println();

        // print formatted info card
        System.out.println("Personal Card information");
        System.out.println("=================");

        // print user's name
        System.out.println("Name: " + name);

        // print user's age
        System.out.println("Age: " + age);

        // print user's city
        System.out.println("City: " + city);

        System.out.println("=================");

        // close scanner to free system resources
        scanner.close();
    }
}

package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner;   // import Scanner class for user input

public class IfElseV2 {
    public static void main(String [] args) {
        
        // SCANNER OBJECT:
        // used to read keyword input
        Scanner scanner = new Scanner(System.in);

        // USER INPUT SECTION
        // ask user for age
        System.out.println("How old are you?");
        
        // read integer input from user
        int age = scanner.nextInt();

        // IF-ELSE STATEMENT:
        // used to make decisions based on conditions

        // checks if age is 18 or older
        if (age >= 18) {

            // runs when the conditions is true
            System.out.println("You are an adult!");
        } else {
            
            // runs when the condition is false
            System.out.println("You are an minor !");
        }

        // close scanner to free system resources
        scanner.close();
    }
}

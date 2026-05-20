package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner; // import Scanner class for user input

public class NestedIfV2 {
    public static void main(String[] args) {

        // SCANNER OBJECT:
        // used to read keyword input
        Scanner scanner = new Scanner(System.in);

        // USER INPUT SECTION

        // ask user for age
        System.out.println("How old are you?");

        // read integer input
        int age = scanner.nextInt();

        // BOOLEAN VARIABLE:
        // true means user has ID card
        // false means no ID card
        boolean hasID = true;

        // NESTED IF STATEMENT
        // one if statement inside another if statement

        // first condition checks age
        if (age >= 18) {

            // secund condition checks ID card
            if (hasID) {

                // runs if user is adult and has ID
                System.out.println("Has ID, Access granted!");
            } else {

                // runs if user is adult but has no ID
                System.out.println("Need ID card, Access Denied!");
            }
        } else {

            // runs if user is under 18
            System.out.println("Too young!");
        }

        // close scanner to free system resources
        scanner.close();
    }
}

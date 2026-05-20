package week_2_control_flow.day_1_if_else_statements;

public class NestedIf {
    public static void main(String[] args) {

        // VARIABLES:

        // stores person's age values
        int age = 20;

        // stores true or false value
        // true means the person has an ID card
        boolean hasID = true;

        // NESTED IF:
        // an if statement inside another if statement

        // first condition checks age
        if (age >= 18) {

            // secund condition checks if person has ID
            if (hasID) {

                // runs if both condition is true
                System.out.println("Access granted!");
            } else {

                // runs if age is true but no ID is provided
                System.out.println("Need ID card!");
            }
        } else {

            // runs if age is under 18
            System.out.println("Too young ❌");
        }
    }
}

package week_2_control_flow.day_1_if_else_statements;

public class IfElse {
    public static void main(String[] args) {

        // VARIABLE:
        // Declared and initialized
        // stores the person's age
        int age = 18;

        /*
         * IF-ELSE STATEMENT
         * Used for condition making in Java
         * if (condition)
         * -> runs code only if condition is true
         * else
         * runs when condition is false
         */

        // CONDITION:
        // checks if age is greater than or equal to 18 
        if (age >= 18) {
            
            // executes when condition is true
            System.out.println("Your are an adult!");
        } else {

            // executes when condition is false
            System.out.println("You are a minor!");
        }
    }
}

package week_2_control_flow.day_1_if_else_statements;

public class Ternary {
    public static void main(String[] args) {

        // VARIABLE:
        // stores integer value -> person's age
        int age = 20;

        // TERNARY OPERATOR:
        // short form of if-else statement

        // syntax:
        // (condition) ? valueIfTrue : valueIfFalse
        // ? valueIfTrue -> represent true condition
        // : valueIfFalse -> represent false condition
        // output is witch one is right

        // checks if age is 18 or more
        // if age is 18 or more print 'Adult'
        // if age is under 18 print 'Minor'
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result); // prints Adult

        // TERNARY OPERATOR (MAX VALUE):
        // checks which number is greater
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max); // prints: Max: 20
    }
}

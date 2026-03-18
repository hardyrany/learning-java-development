package week_2_control_flow.day_1_if_else_statements;

public class Ternary {
    public static void main(String[] args) {

        int age = 20;

        // condition ? valueIfTrue : valueIfFalse
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result); // Adult

        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max); // Max: 20
    }
}

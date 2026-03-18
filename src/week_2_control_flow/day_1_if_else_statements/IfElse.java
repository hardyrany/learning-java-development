package week_2_control_flow.day_1_if_else_statements;

public class IfElse {
    public static void main(String[] args) {

        // Declare a variable
        int age = 18;

        /* if (condition)
            if = true -> print condition output
            if = false -> print else condition output
         */
        if (age >= 18) {
            System.out.println("Your are an adult ✅");
        } else {
            System.out.println("You are a minor ❌");
        }
    }
}

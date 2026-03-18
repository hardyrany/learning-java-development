package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner;

public class IfElseV2 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult ✅");
        } else {
            System.out.println("You are an minor ❌");
        }

        scanner.close();
    }
}

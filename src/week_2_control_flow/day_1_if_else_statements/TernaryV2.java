package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner;

public class TernaryV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        // condition ? valueIfTrue : valueIfFalse
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);

        int a = 18, b = 100;
        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        scanner.close();
    }
}

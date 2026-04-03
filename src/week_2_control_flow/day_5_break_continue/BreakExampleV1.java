package week_2_control_flow.day_5_break_continue;

import java.util.Scanner;

public class BreakExampleV1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Found 5! Stopping loop.");
                break; // exits the loop completely
            }
            System.out.println("Number: " + i);
        }
        scanner.close();
    }
}


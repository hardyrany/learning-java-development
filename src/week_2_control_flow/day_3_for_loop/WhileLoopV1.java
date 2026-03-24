package week_2_control_flow.day_3_for_loop;

import java.util.Scanner;

public class WhileLoopV1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digit 1 to 5: ");
        int i = scanner.nextInt();

        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }

        scanner.close();
    }
}

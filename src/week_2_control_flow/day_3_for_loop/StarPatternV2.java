package week_2_control_flow.day_3_for_loop;

import java.util.Scanner;

public class StarPatternV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number 1 to 5");
        int i = scanner.nextInt();

        for (; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

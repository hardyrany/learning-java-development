package week_2_control_flow.day_3_for_loop;

import java.util.Scanner;

public class ForLoopV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number - 0 to 10");
        int i = scanner.nextInt();

        // for (initialization; condition, pre-increment)
        for (; i <= 10; ++i) {
            System.out.println("Count: " + i);
        }

        scanner.close();
    }
}

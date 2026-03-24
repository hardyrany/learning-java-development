package week_2_control_flow.day_3_for_loop;

import java.util.Scanner;

public class MultiTableV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digit a number: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table of " + num);
        for (int i = 10; i >= 1; --i) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}

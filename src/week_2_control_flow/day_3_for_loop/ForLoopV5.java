package week_2_control_flow.day_3_for_loop;

import java.util.Scanner;

public class ForLoopV5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a decrement number");
        int i = scanner.nextInt();

        for (; i >= 1; --i) {
            System.out.println("Count: " + i);
        }

        scanner.close();
    }
}

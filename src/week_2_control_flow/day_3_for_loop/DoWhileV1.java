package week_2_control_flow.day_3_for_loop;

import java.util.Scanner;

public class DoWhileV1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        do {
            System.out.println("Number: " + i);
            i++;
        } while(i <= 5);

        int x = scanner.nextInt();

        do {
            System.out.println("This runs once even though x > 5");
        } while (x < 5);

        scanner.close();
    }
}

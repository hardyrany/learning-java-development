package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner;

public class NestedIfV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        boolean hasID = true;

        if (age >= 18) {
            if(hasID){
                System.out.println("Has ID, Access granted ✅");
            } else{
                System.out.println("Need ID card, Access Denied⚠️");
            }
        } else {
            System.out.println("Too young ❌");
        }

        scanner.close();
    }
}

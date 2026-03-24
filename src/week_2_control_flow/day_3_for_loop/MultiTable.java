package week_2_control_flow.day_3_for_loop;

public class MultiTable {
     public static void main(String[] args) {

        int num = 10;

        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
     }
}

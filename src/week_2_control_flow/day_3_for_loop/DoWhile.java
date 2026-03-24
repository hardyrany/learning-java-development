package week_2_control_flow.day_3_for_loop;

public class DoWhile {
     public static void main(String[] args) {

        int i = 1;

        // runs FIRST, then checks condition
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);

        // Even if condition is false from start, runs at least ONCE
        int x = 10;
        do {
            System.out.println("This runs once even though x > 5");
        } while (x < 5);
    }
}

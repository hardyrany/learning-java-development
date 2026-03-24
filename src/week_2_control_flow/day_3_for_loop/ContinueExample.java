package week_2_control_flow.day_3_for_loop;

public class ContinueExample {
    public static void main(String[] args) {

        // Skip even numbers, only print odd
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
        System.out.println("Odd: " + i);
        }
    }
}

package week_2_control_flow.day_5_break_continue;

public class BreakExample {
    public static void main(String[] args) {

        // Stop loop when we find number 5
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Found 5! Stopping loop.");
                break; // exits the loop completely
            }
            System.out.println("Number: " + i);
        }
    }
}
// Output: 1, 2, 3, 4, Found 5! Stopping loop

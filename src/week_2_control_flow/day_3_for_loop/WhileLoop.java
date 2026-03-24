package week_2_control_flow.day_3_for_loop;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        // runs WHILE condition is true
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++; // IMPORTANT: always update, or infinite loop!
        }
    }
}

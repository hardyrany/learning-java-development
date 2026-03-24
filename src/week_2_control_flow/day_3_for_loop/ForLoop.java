package week_2_control_flow.day_3_for_loop;

public class ForLoop {
    public static void main(String[] args) {

        // for (start; condition; pre-increment)
        System.out.println("Pre-increment:");
        for (int i = 1; i <= 5; ++i) {
            System.out.println("Count: " + i);
        }
        // Output: 1, 2, 3, 4, 5 
    }
}

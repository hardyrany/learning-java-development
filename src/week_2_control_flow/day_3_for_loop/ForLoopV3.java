package week_2_control_flow.day_3_for_loop;

public class ForLoopV3 {
    public static void main(String[] args) {

        System.out.println("Pre-decrement: ");
        // for (initialization; condition; pre-decrement)
        for (int i = 10; i >= 1; --i) {
            System.out.println("Count: " + i);
        }
    }
}

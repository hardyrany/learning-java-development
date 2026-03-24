package week_2_control_flow.day_3_for_loop;

public class StarPattern {
    public static void main(String[] args) {

        // 5x5 star pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

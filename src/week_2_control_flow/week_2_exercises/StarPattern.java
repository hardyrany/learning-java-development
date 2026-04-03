package week_2_control_flow.week_2_exercises;

// Print this pattern using nested loops:
// * * * * *
// * * * *
// * * *
// * *
// *

public class StarPattern {
    public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package week_3_methods_arrays.day_5_arrays;

// Looping Through Arrays
public class ArrayLoops {
    public static void main(String[] args) {

        int[] scores = { 85, 92, 78, 92, 88 };

        // Method 1: Regular for loop
        System.out.println("--- Regular For Loop ---");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Index " + i + ": " + scores[i]);
        }

        // Method 2: Enhanced for loop (for-each)
        System.out.println("--- For Each Loop ---");
        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        System.out.println("=============");
        // Calculate sum and average
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

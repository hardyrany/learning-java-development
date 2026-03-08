public class ControlFlow {
    public static void main (String[] args) {

        int score = 75;

        // If-else
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        System.out.println();

        // For loop
        for (int i = 1; i <= 90; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println();

        // While loop
        int x = 10;
        while (x > 0) {
            System.out.println(x);
            x -= 3;
        }
    }
}

public class ControlFlow {
    public static void main(String[] args) {

        // variable to store integer value score
        int score = 75;

        // IF-ELSE STATEMENT (decision making)

        // checks if score is 90 or more
        if (score >= 90) {
            System.out.println("Grade: A");

            // checks if score is 75 or more
        } else if (score >= 75) {
            System.out.println("Grade: B");

            // runs if none of the above conditions are true
        } else {
            System.out.println("Grade: C");
        }

        System.out.println();

        // FOR LOOP (repeats a block of code a fixed number of times)

        // runs from 1 to 90
        for (int i = 1; i <= 90; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println();

        // WHILE LOOP (repeats while condition is true)

        // variable to store integer value x
        int x = 10;

        // loop runs x until x becomes 0 or negative
        while (x > 0) {
            System.out.println(x);

            // decrease x 3 each time
            x -= 3;
        }
    }
}

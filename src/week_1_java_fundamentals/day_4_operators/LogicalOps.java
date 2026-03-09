package week_1_java_fundamentals.day_4_operators;

public class LogicalOps {
    public static void main(String[] args) {

        int x = 10, y = 20;
        System.out.println(x);
        System.out.println(y);

        // Comparison (returns true/false)
        System.out.println(x == y); // false (equal to)
        System.out.println(x != y); // true (not equal)
        System.out.println(x > y);  // false (greater than)
        System.out.println(x < y);  // true (less than)
        System.out.println(x >= y); // false (greater or equal)
        System.out.println(x <= y); // true (less or equal)

        // Logical
        System.out.println(x < y && x > 5); // true (AND - both must be true)
        System.out.println(x > y || x > 5); // true (OR - one must be true)
        System.out.println(!(x == y));  // true (NOT - reverses result)
    }
}

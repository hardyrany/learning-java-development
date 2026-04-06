package week_3_methods_arrays.day_4_recursion_method_calling_itself;

public class Recursion {

    // Countdown using recursion
    static void countDown(int n) {
        if (n == 0) { // BASE CASE - stop condition
            System.out.println("Blast off!");
            return;
        }
        System.out.println(n);
        countDown(n - 1); // RECURSIVE CALL
    }

    // Factorial using recursion
    // 5! = 5 x 4 x 3 x 2 x 1 = 120
    static int factorial(int n) {
        if (n == 1)
            return 1; // BASE CASE
        return n * factorial(n - 1); // RECURSIVE CALL
    }

    // Fibonacci using recursion
    // 0, 1, 1, 2, 5, 8, 13
    static int fibonacci(int n) {
        if (n <= 1)
            return n; // BASE CASE
        return fibonacci(n - 1) + fibonacci(n - 2); // RECURSIVE CALL
    }

    public static void main(String[] args) {

        countDown(7);
        System.out.println("5! = " + factorial(5));
        System.out.println("Fib(7) = " + fibonacci(7));
    }
}
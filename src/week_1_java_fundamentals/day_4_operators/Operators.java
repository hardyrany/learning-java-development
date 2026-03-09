package week_1_java_fundamentals.day_4_operators;

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 3;

        System.out.println("a: " + a);  // 10 value
        System.out.println("b: " + b);  // 3 value
        System.out.println("a + b: " + (a + b));    // 13 (addition)
        System.out.println("a + b: " + (a - b));    // 7 (subtraction)
        System.out.println("a * b: " + (a * b));    // 30 (multiplication)
        System.out.println("a / b: " + (a / b));    // 3 (division - integer result!)
        System.out.println("a % b: " + (a % b));    // 1 (modulus - remainder)

        // Fix division to get decimal
        double result = (double) a / b;
        System.out.println("result: " + result); // 3.3333...
    }
}

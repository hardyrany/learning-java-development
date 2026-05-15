package week_1_java_fundamentals.day_4_operators;

public class Operators {
    public static void main(String[] args) {

        // declare two integer variables
        int a = 10, b = 3;

        // print variable values
        System.out.println("a: " + a);  // 10
        System.out.println("b: " + b);  // 3

        // addition
        // + adds two numbers
        System.out.println("a + b: " + (a + b));    // 13
        
        // subtraction
        // - subtracts secund number from first
        System.out.println("a + b: " + (a - b));    // 7
        
        // multiplication
        // * multiplies two numbers
        System.out.println("a * b: " + (a * b));    // 30
        
        // division
        // / divides numbers
        // integer division removes decimal part
        System.out.println("a / b: " + (a / b));    // 3
        
        // modulus
        // % returns remainder after division
        System.out.println("a % b: " + (a % b));    // 1

        // TYPE CASTING
        // convert a to double for decimal division
        // fix division to get decimal
        double result = (double) a / b;

        // prints decimal result
        System.out.println("result: " + result); // 3.3333...
    }
}

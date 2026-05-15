package week_1_java_fundamentals.day_4_operators;

public class LogicalOps {
    public static void main(String[] args) {

        // declare two integer variables
        int x = 10, y = 20;

        // print variables
        System.out.println(x);
        System.out.println(y);

        // COMPARISON OPERATORS
        // comparison operators return true or false

        // == check if values are equal
        System.out.println(x == y); // false
        
        // != checks if values are not equal
        System.out.println(x != y); // true
        
        // > checks if left value is greater
        System.out.println(x > y);  // false

        // < checks if left value is smaller
        System.out.println(x < y);  // true

        // >= checks if greater than or equal
        System.out.println(x >= y); // false

        // <= checks if less than or equal
        System.out.println(x <= y); // true 

        // LOGICAL OPERATORS

        // && (AND)
        // true only if both conditions are true
        System.out.println(x < y && x > 5); // true

        // || (OR)
        // true if at least one condition is true
        System.out.println(x > y || x > 5); // true

        // ! (NOT)
        // reverses the result
        System.out.println(!(x == y));  // true
    }
}

package week_1_java_fundamentals.day_4_operators;

public class Shorthand {
    public static void main(String[] args) {

        // declare integer variable
        int num = 10;

        // ASSIGNMENT OPERATORS

        // add 5 to num
        num += 5;   // num = num + 5 → 15

        // subtract 3 from num
        num -= 3;   // num = num - 3 → 12

        // multiply num by 2
        num *= 2;   // num = num * 2 → 24
        
        // divide num by 4
        num /= 4;   // num = num / 4 → 6

        // store remainder after division by 4
        num %= 4;   // num = num % 4 → 2

        // INCREMENT & DECREMENT OPERATORS
        
        // increase value by 1 
        num++;  // num = num + 1  → 3

        // decrease value by 1
        num--;  // num = num - 1  → 2

        // pre-increment
        ++num;

        // pre-decrement
        --num;

        // print final value
        System.out.println(num); // 2
    }
}

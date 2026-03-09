package week_1_java_fundamentals.day_4_operators;

public class Shorthand {
    public static void main(String[] args) {

        int num = 10;

        // Assignment Operators
        num += 5;   // num = num + 5 → 15
        num -= 3;   // num = num -3 → 12
        num *= 2;   // num = num *2 → 24
        num /= 4;   // num = num /4 → 6
        num %= 4;   // num = num %4 → 2

        // Increment & Decrement
        num++;  // num = num + 1  → 3
        num--;  // num = num - 1  → 2
        ++num;
        --num;

        System.out.println(num); // 2
    }
}

package week_3_methods_arrays.day_2_method_types;

public class ReturnMethods {

    // Returns int
    static int multiply(int a, int b) {
        return a * b;
    }

    // Returns double
    static double circleArea(double radius) {
        return 3.14159 * radius * radius;
    }

    // Return String
    static String getGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";          
    }

    // Returns boolean
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Product: " +  multiply(4, 5));
        System.out.println("Area: " + circleArea(7));
        System.out.println("Grade: " + getGrade(85));
        System.out.println("Is Even: " + isEven(10));
    }
}

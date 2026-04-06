package week_3_methods_arrays.day_3_method_overloading;

// Same method Name. Different Parameters

public class Overloading {

    // Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Add a String (concatenate)
    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
        System.out.println(add(3.5, 2.5));
        System.out.println(add("Hello", " Java"));
    }
}

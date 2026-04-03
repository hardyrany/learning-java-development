package week_3_methods_arrays.day_1_introduction_to_methods;

public class MethodBasics {

    // METHOD STRUCTURE:
    // accessModifier returnType methodName(parameters) {body}

    // Method with NO parameters, NO return value
    static void sayHello() {
        System.out.println("Hello, Java Developer!");
    }

    // Method WITH parameters, NO return value
    static void greet(String name) {
        System.out.println("Hello, " + name + " Java Developer!");
    }

    // Method WITH parameters AND return value
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        sayHello(); 
        greet("Hardy");
        int sum = add(20, 8);
        System.out.println("Birthday date: " + sum);
    }
}

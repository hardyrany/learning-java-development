public class Methods {

    // Method with return value
    static  int add(int a, int b) {
        return a + b;
    }

    // Method without return value
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Sum: " + result); // Sum: 15

        greet("Alice"); // Hello, Alice!
    }
}

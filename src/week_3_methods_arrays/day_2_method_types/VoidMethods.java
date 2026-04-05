package week_3_methods_arrays.day_2_method_types;

public class VoidMethods {

    // Prints a line separator
    static void printLine() {
        System.out.println("=============================");    
    }

    // Print user info card
    static void printInfo(String name, int age, String city) {
        printLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        printLine();
    }
    
    public static void main(String[] args) {

        printInfo("Alice", 25, "New York");
        printInfo("Bob", 30, "London");
    }
}

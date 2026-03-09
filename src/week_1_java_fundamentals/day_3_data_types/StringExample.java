package week_1_java_fundamentals.day_3_data_types;

public class StringExample {
    public static void main(String[] args) {

        String name = "Alice";
        String greeting = "Hello, " + name + "!"; // concatenation

        // Useful String methods
        System.out.println(name.length());  // 5
        System.out.println(name.toUpperCase()); // ALICE
        System.out.println(name.toLowerCase()); // aline
        System.out.println(name.charAt(0)); // A
        System.out.println(name.contains("lic"));
        System.out.println(name.replace("A", "E")); // Elice
        System.out.println(" hi".trim());   // hi (removes spaces)
        System.out.println(greeting);   // Hello, Alice!
    }
}

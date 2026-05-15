package week_1_java_fundamentals.day_3_data_types;

public class StringExample {
    public static void main(String[] args) {

        // String stores text data
        String name = "Alice";

        // String concatenation joins multiple strings together
        String greeting = "Hello, " + name + "!";

        // Useful String methods

        // length() returns the number of characters
        System.out.println(name.length());

        // toUpperCase() converts all letters to uppercase
        System.out.println(name.toUpperCase());

        // to LowerCase() converts all letters to lowercase
        System.out.println(name.toLowerCase());

        // charAt(index) returns character at a specific position
        System.out.println(name.charAt(0));

        // contain() checks if text exists inside the string
        System.out.println(name.contains("lic"));

        // replace() characters or words
        System.out.println(name.replace("A", "E"));

        // trim() removes spaces from beginning and end
        System.out.println(" hi".trim());

        // print final greeting
        System.out.println(greeting);
    }
}

package week_1_java_fundamentals.day_2_first_java_program;

public class HelloWorld {
    public static void main(String[] args) {

        // Prints text and moves to the next line
        System.out.println("Hello World");

        // Prints text without moving to a new line
        System.out.print("Hello ");

        // \n manually creates a new line
        System.out.print("Java!\n"); 
    }

    /*
     * public -> accessible from anywhere
     * class -> blueprint for your program
     * HelloWorld -> name of the class (must match filename)
     * static -> belongs to the class, not an object
     * void -> methods returns nothing
     * main -> starting point of the program
     * String[] args -> command-line arguments
     */
}

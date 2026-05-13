package week_1_java_fundamentals.day_2_first_java_program;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World"); // prints with new line
        System.out.print("Hello "); // print without new line
        System.out.print("Java!\n"); // \n = new line manually
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

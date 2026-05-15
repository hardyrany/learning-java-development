public class Methods {

    // METHOD:
    // A method is a block of code that performs a specific task
    // It runs only when it is called

    // static means:
    // the method belong to the CLASS, not to an object
    // we can call it without creating an object

    // RETURN TYPE
    // int -> means this method MUST return an integer value

    // METHOD NAME:
    // add -> name used to call this method

    // PARAMETERS:
    // (int a, int b) -> inputs values given to the method
    static int add(int a, int b) {
        return a + b; // RETURN:
        // sends the result back to where the method was called
    }

    // METHOD:
    // greet -> a method that performs an action (prints message)

    // static means:
    // belongs to the class, so no object is needed to call it

    // void -> means this method does NOT return any value

    // PARAMETER:
    // String name -> input value used inside the method
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        // ACTION:
        // print output to the console
    }

    public static void main(String[] args) {

        // MAIN METHOD:
        // entry point of eny Java program (program starts here)

        // static means:
        // Java can run main without creating an object of the class

        // METHOD CALL:
        // calling add() method with arguments 5 and 10
        int result = add(5, 10);

        // storing returned value (15) in variable result
        System.out.println("Sum: " + result); // Sum: 15

        // calling greet() method
        // passing "Alice" as argument
        greet("Alice"); // Hello, Alice!
    }
}

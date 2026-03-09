package week_1_java_fundamentals.day_5_user_input_scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create Scanner object

        // String input
        System.out.println("Enter your name: " );
        String name = scanner.nextLine();

        // Integer input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Double input
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Display output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        scanner.close();    // close scanner when done
    }
}

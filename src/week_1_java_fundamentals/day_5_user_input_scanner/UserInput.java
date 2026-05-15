package week_1_java_fundamentals.day_5_user_input_scanner;

import java.util.Scanner;   // import Scanner class for user input

public class UserInput {
    public static void main(String[] args) {

        // create Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // STRING INPUT

        // ask user to enter name
        System.out.println("Enter your name: " );

        // read full line of text
        String name = scanner.nextLine();

        // INTEGER INPUT

        // ask user to enter age
        System.out.println("Enter your age: ");

        // read integer value
        int age = scanner.nextInt();

        // DOUBLE INPUT
        
        //  ask user to enter salary
        System.out.println("Enter your salary: ");

        // read decimal number
        double salary = scanner.nextDouble();

        // DISPLAY OUTPUT

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // close scanner to free resources 
        scanner.close();
    }
}

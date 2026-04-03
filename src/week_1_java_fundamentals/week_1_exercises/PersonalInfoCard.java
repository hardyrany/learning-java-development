package week_1_java_fundamentals.week_1_exercises;

// Create a program that:
// 1. Asks for name, age, and city
// 2. Prints a formatted info card like:
// ====================================
// Name: Alice
// Age: 25
// City:cNew York
// ====================================

import java.util.Scanner;

public class PersonalInfoCard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("What city you live?");
        String city = scanner.nextLine();

        System.out.println();

        System.out.println("Personal Card information");
        System.out.println("=================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("=================");

        scanner.close();
    }
}

package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner;   // import Scanner class for use input

public class GradeCheckerV2 {
    public static void main(String[] args) {


        // SCANNER OBJECT:
        // used to read input from keyword
        Scanner scanner = new Scanner(System.in);

        // INPUT SECTION:
        // ask user to enter score
        System.out.print("Enter your grade: ");
        
        // read integer vale from user
        int score = scanner.nextInt();

        // IFL-ELSE IF LADDER:
        // used to check multiple conditions in order

        // CONDITION WITH RANGE CHECK:
        // checks if score is between 90 and 100
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");

        // checks if score is between 80 and 90
        } else if (score >= 80 && score <= 90) {
            System.out.println("Grade: B");

        // checks if score is between 70 and 80
        } else if (score >= 70 && score <= 80) {
            System.out.println("Grade: C");

        // checks if score is between 60 and 70    
        } else if (score >= 60 && score <= 70) {
            System.out.println("Grade: D");

        // runs if score is below 60 or invalid    
        } else {
            System.out.println("Grade: F");
        }

        // close scanner to free system resources
        scanner.close();
    }
}

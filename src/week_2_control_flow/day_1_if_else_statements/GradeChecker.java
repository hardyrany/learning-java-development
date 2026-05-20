package week_2_control_flow.day_1_if_else_statements;

public class GradeChecker {
    public static void main(String[] args) {
        
        // VARIABLE:
        // stores integer value -> the student's score 
        int score = 85;

        // IF-ELSE LADDER:
        // used to check multiple conditions in order

        // checks if score is 90 or more
        if (score >= 90) {

            // runs when the conditions is true
            System.out.println("Garde: A");

            // checks if score is 80 or more
        } else if (score >= 80) {
            
            // runs when the condition is false
            System.out.println("Grade: B");

            // checks if score is 70 or more
        } else if (score >= 70) {
            System.out.println("Grade: C");

            // checks if score is 60 or more
        } else if (score >= 60) {
            
            // runs when all the condition above is false
            // runs if none of the above conditions are true
            System.out.println("Grade: D");
        } else {
            
            System.out.println("Grade: F");
        }
    }
}

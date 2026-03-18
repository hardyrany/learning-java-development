package week_2_control_flow.day_1_if_else_statements;

import java.util.Scanner;

public class GradeCheckerV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A 🌟");
        } else if (score >= 80 && score <= 90) {
            System.out.println("Grade: B 👍");
        } else if (score >= 70 && score <= 80) {
            System.out.println("Grade: C 🙂");
        } else if (score >= 60 && score <= 70) {
            System.out.println("Grade D: ⚠️");
        } else {
            System.out.println("Grade: F ❌");
        }

        scanner.close();
    }
}

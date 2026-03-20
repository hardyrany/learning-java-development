package week_2_control_flow.day_2_switch_statement;

import java.util.Scanner;

public class WeekendCheckerV2 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Weekdays");
        String day = scanner.nextLine();


        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday - Go to work!");                            
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend - Time to relax!");
                break;
            default:
                System.out.println("Invalid day!");
        }
        scanner.close();
     }
}

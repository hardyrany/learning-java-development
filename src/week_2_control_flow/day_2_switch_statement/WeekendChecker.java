package week_2_control_flow.day_2_switch_statement;

public class WeekendChecker {
    public static void main(String[] args) {

        String day = "Saturday";

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday - Go to works!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend - Time to relax!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}

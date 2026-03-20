package week_2_control_flow.day_2_switch_statement;

public class SeasonSwitch {
    public static void main(String[] args) {

        String season = "Summer";

        switch (season) {
            case "Spring":
                System.out.println("Flowers are blooming!");
                break;
            case "Summer":
                System.out.println("It's hot outside!");
                break;
            case "Autumn":
                System.out.println("Leaves are falling!");
                break;
            case "Winter":
                System.out.println("It's cold outside!");
                break;
            default:
                System.out.println("Unknown season!");
        }
    }

}

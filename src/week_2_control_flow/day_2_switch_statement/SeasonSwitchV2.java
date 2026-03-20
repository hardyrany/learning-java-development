package week_2_control_flow.day_2_switch_statement;

import java.util.Scanner;

public class SeasonSwitchV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number 1 to 4");
        int season = scanner.nextInt();

        switch (season) {
            case 1:
                System.out.println("It's Spring Season!");
                System.out.println("Flowers are blooming!");
                break;
            case 2:
                System.out.println("It's Summer Time!");
                System.out.println("It's hot outside!");
                break;
            case 3:
                System.out.println("It's Autumn Season!");
                System.out.println("Leaves are falling!");
                break;
            case 4:
                System.out.println("It's Winter Time!");
                System.out.println("It's cold outside!");
                break;
            default:
                System.out.println("Unknown season!");
        }
        scanner.close();
    }

}

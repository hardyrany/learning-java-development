package week_2_control_flow.day_1_if_else_statements;

public class NestedIf {
    public static void main (String[] args){

        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Access granted ✅");
            } else {
                System.out.println("Need ID card ⚠️");
            }
        } else {
            System.out.println("Too young ❌");
        }
    }
}

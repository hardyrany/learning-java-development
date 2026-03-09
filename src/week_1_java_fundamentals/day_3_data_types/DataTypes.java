package week_1_java_fundamentals.day_3_data_types;

public class DataTypes {
    public static void main(String[] args) {

        // INTEGER types
        byte smallNum = 100;    // -128 to 127
        short mediumNum = 30000;    // -32,768 to 32,767
        int age = 25;   // -2 billion to 2 billion (most used)
        long bigNum = 9876543210L;  // very large numbers(add L at end)

        // DECIMAL Types
        float pi1 = 3.14f;  // less precise (add f at end)
        double pi2 = 3.14159265358979;  // more precise (most used)

        // OTHER Types
        char letter = 'A';  // single character (use single quotes)
        boolean isJavaFun = true;

        System.out.println("smallNum: " + smallNum);
        System.out.println("mediumNum: " + mediumNum);
        System.out.println("age: " + age);
        System.out.println("bigNum: " + bigNum);
        System.out.println("pi1: " + pi1);
        System.out.println("pi2: " + pi2);
        System.out.println("letter: " + letter);
        System.out.println("isJavaFun? " + isJavaFun);
    }
}

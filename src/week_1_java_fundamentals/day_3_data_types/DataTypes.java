package week_1_java_fundamentals.day_3_data_types;

public class DataTypes {
    public static void main(String[] args) {

        // INTEGER types

        // byte stores very small whole numbers
        byte smallNum = 100;

        // short stores medium-sized whole numbers
        short mediumNum = 30000;    // -32,768 to 32,767
        
        // int is the most commonly used integer type
        int age = 25;

        // Long stores very large whole numbers
        // L is added at the end to tell Java it's a long value
        long bigNum = 9876543210L;

        // DECIMAL Types

        // float stores decimal numbers with less precision
        // f is required at the end
        float pi1 = 3.14f; 

        // double stores decimal numbers  with more precision
        double pi2 = 3.14159265358979;

        // OTHER Types
        // char stores a single character using single quotes
        char letter = 'A';
        
        // boolean stores only true or false
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

package week_3_methods_arrays.day_5_arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        // Method 1: Declare then assign
        int[] numbers = new int[5]; // creates arrays of 5 zeros
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Method 2: Declare and initialize together
        String[] fruits = {"Apple", "Banana", "Orange", "Pear", "Strawberry", "Mango"};

        // Access elements
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Original Array: " + Arrays.toString(fruits));
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3]);
        System.out.println(fruits[0] + " " + fruits[1] + " " + fruits[2] + " " + fruits[3]);
        System.out.println(fruits.length);

        // Modify element
        fruits[0] = "Blueberry";
        System.out.println(fruits[0]);
    }
}

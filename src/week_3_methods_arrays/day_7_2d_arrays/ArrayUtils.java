package week_3_methods_arrays.day_7_2d_arrays;

import java.util.Arrays;

/* 
 * Useful Array Utilities
 * java.util.Arrays Class
 */
public class ArrayUtils {
    public static void main(String[] args) {
        
        int[] numbers = {5, 3, 8, 1, 9, 2, 7};

        // Sort array
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // Binary search (array must be sorted first)
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Found 7 at index: " + index);   // 4

        // Copy array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        // Fill array with a value
        int[] filled = new int[9];
        Arrays.fill(filled, 99);
        System.out.println("Filled: " + Arrays.toString(filled));  // [99, 99, 99, 99, 99]

        // Compare two arrays
        boolean equal = Arrays.equals(numbers, copy);
        System.out.println("Equal; " + equal); // True
        
    }
    
}

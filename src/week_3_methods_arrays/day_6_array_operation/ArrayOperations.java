package week_3_methods_arrays.day_6_array_operation;

// Find Min, Max, Search
public class ArrayOperations {

    // Find maximum value
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Find minimum value
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Search for value (Linear Search)
    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // return index
        }
        return -1; // not found
    }

    // Reverse an array
    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Max: " + findMax(numbers)); // 90
        System.out.println("Min: " + findMin(numbers)); // 11

        int idx = search(numbers, 25);
        System.out.println("Found 25 at index: " + idx);

        reverse(numbers);
        System.out.println("Reversed: ");
        for (int n : numbers) System.out.println(n + " ");  // 90 11 22 12 25 34 64
            
    }
}

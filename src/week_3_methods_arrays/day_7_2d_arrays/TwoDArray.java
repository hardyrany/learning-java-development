package week_3_methods_arrays.day_7_2d_arrays;

// Creating & Accessing 2D Arrays
public class TwoDArray {

    public static void main(String[] args) {

        // Declared 2D array (3 rows, 3 columns)
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Access single element [row][column]
        System.out.println(matrix[0][0]); // 1 (row 0, col 0)
        System.out.println(matrix[1][1]); // 5 (row 1, col 1)
        System.out.println(matrix[2][2]); // 9 (row 2, col 2)

        // Print full matrix
        System.out.println("--- Matrix ---");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}

// Output:
// 1 2 3
// 4 5 6
// 7 8 9

public class Arrays {
    public static void main(String[] args) {

        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // ACCESSING ARRAY ELEMENTS (index start from 0)
        System.out.println("Fast: " + numbers[0]); // first element = 10
        System.out.println("Slow: " + numbers[1]); // secund element = 20
        System.out.println("Quick: " + numbers[2]); // third element = 30
        System.out.println("Binary: " + numbers[3]); // fourth element = 40
        System.out.println("Last: " + numbers[4]); // fifth element = 50

        // ENHANCED FOR LOOP (for-each loop)
        
        // automatically iterates through element in the array
        // It goes through each element in the "numbers" array one by one
        // "number" temporarily holds the current value from the array
        for (int number : numbers) {
            System.out.println(number);
        }

        // ARRAY PROPERTIES AND ACCESS
        
        // get last element using index
        System.out.println("Last: " + numbers[4]); // 50
        
        // get first element
        System.out.println("First: " + numbers[0]); // 10
        
        // get size of array
        System.out.println("Length: " + numbers.length); // 5
    }
}

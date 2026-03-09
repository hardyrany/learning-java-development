public class Arrays {
    public static void main(String[] args) {

        // Declare and initialize
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements
        System.out.println("Fast: " + numbers[0]); // 10
        System.out.println("Slow: " + numbers[1]); // 20
        System.out.println("Quick: " + numbers[2]); // 30
        System.out.println("Binary: " + numbers[3]); // 40
        System.out.println("Last: " + numbers[4]); // 50

        // Loop through array
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Last: " + numbers[4]); // 50
        System.out.println("First: " + numbers[0]); // 10
        System.out.println("Length: " + numbers.length); // 5
    }
}

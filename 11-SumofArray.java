public class ArraySum {

    public static int sumOfArray(int[] array) {
        int sum = 0; // Initialize the sum variable to 0

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Return the calculated sum
        return sum;
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5}; // Example array
        int sum = sumOfArray(exampleArray); // Call the function to compute the sum
        System.out.println("The sum of the array elements is: " + sum); // Print the result
    }
}

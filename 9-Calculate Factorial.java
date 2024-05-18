public class CalculateFactorial {
    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        // Base case: if n is 0, factorial is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: calculate factorial by multiplying n with factorial of (n-1)
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Number for which factorial is to be calculated
        int result = factorial(number); // Calculate factorial
        // Print the result
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

import java.util.Scanner;

public class CheckPrimeNumber {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // If the number is less than or equal to 1, it's not prime
        if (num <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (num == 2) {
            return true;
        }
        // Any other even number is not prime
        if (num % 2 == 0) {
            return false;
        }
        // Check for factors from 3 up to the square root of the number
        // Increment by 2 to skip even numbers
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            // If a factor is found, the number is not prime
            if (num % i == 0) {
                return false;
            }
        }
        // If no factors are found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // Read an integer input from the user
        int num = sc.nextInt();
        // Check if the input number is prime and print the result
        if (isPrime(num)) {
            System.out.println("It is a Prime Number.");
        } else {
            System.out.println("It is not a Prime Number.");
        }
        // Close the Scanner object
        sc.close();
    }
}

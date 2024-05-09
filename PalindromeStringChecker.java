public class PalindromeStringChecker {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to handle case sensitivity
        str = str.toLowerCase();

        // Remove non-alphanumeric characters using a regular expression
        str = str.replaceAll("[^a-z0-9]", "");

        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = str.length() - 1;

        // Iterate over the string, comparing characters from both ends towards the center
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                // If characters don't match, it's not a palindrome
                return false;
            }
            // Move the pointers towards the center
            start++;
            end--;
        }
        // If the loop completes without returning false, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // Output: true
        System.out.println(isPalindrome("racecar")); // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}

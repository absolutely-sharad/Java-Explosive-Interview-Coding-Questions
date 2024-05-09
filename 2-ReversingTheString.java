public class ReversingTheString {
    // Method to reverse the input string
    public static String reversedString(String str) {
        // Create a StringBuilder to store the reversed string
        StringBuilder reversed = new StringBuilder();
        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder
            reversed.append(str.charAt(i));
        }
        // Convert the StringBuilder to a String and return it
        return reversed.toString();
    }
    // Main method to test the reversedString method
    public static void main(String args[]) {
        // Input string to be reversed
        String str = "Hello";
        // Print the reversed string
        System.out.println(reversedString(str));
    }
}

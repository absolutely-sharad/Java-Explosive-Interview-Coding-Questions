public class NumberofVowels {
    // This method counts the number of vowels in the given string 's'
    public static int countVowels(String s) {
      
        // Convert the string to lowercase to make the vowel check case-insensitive
        s = s.toLowerCase();
        
        // String containing all vowel characters for reference
        String vowels = "aeiou";
        
        // Initialize the counter for vowels
        int count = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is a vowel
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                // If it is, increment the counter
                count++;
            }
        }
        
        // Return the total count of vowels
        return count;
    }

    // Main method to test the countVowels method
    public static void main(String[] args) {
        // Sample string to test the vowel counting
        String s = "Hello babe come here";
        
        // Call the countVowels method and print the result
        System.out.println(countVowels(s));
    }
}

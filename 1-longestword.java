public class longestword {
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using whitespace as delimiter
        String[] words = sentence.split("\\s+");
        // Initialize variables to store the longest word and its length
        String longestWord = "";
        int maxLength = 0;
        // Iterate through each word in the sentenc
        for (String word : words) {
            // Remove any non-alphabetic characters from the word
            word = word.replaceAll("[^a-zA-Z]", "");
            // Check if the current word is longer than the previous longest word
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String args[]){
        String str = "I am a smart boy";
        String longesString = findLongestWord(str);
        System.out.println("Longest word in the string is : " + longesString);
    }
}

public class RemoveWhitespace {
    public static void main(String[] args) {
        String input = "This is a   string with     multiple spaces and \t tabs.";
        
        // Using replaceAll to remove all whitespace characters
        String output = input.replaceAll("\\s+", "");
        
        System.out.println("Original string: " + input);
        System.out.println("String without whitespaces: " + output);
    }
}


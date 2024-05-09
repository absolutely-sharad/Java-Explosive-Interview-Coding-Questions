public class ReversingTheString{
    public static String reversedString(String str){
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length()-1;i >= 0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String args[]){
        String str = "Hello";
        System.out.println(reversedString(str));
    }
}
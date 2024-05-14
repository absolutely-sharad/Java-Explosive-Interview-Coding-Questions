import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElements {
    public static int[] removeDuplicates(int[] array) {
        // Convert array to HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert HashSet back to array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        int[] result = removeDuplicates(array);
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }
}

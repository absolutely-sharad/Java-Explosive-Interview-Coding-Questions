public class LargestNumberInArray{

    // Method to find the largest number in an array
    public static int findLargest(int[] arr){
        // Check if the array is null or empty
        if(arr == null || arr.length == 0){
            return -1; // If so, return -1 indicating no valid maximum value
        }
        
        int max = arr[0]; // Assume the first element as the maximum
        
        // Iterate through the array to find the maximum element
        for(int i = 0;i<arr.length;i++){
            // If the current element is greater than the current maximum, update the maximum
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        return max; // Return the maximum value found
    }
    
    // Main method to test the findLargest method
    public static void main(String[] args) {
        int[] arr = {1,2,3,40,5,6,7,8,9,10}; // Test array
        System.out.println(findLargest(arr)); // Print the result of findLargest method
    }
}

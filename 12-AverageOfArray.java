public class AverageCalculator {
    
    public static void main(String[] args) {
        // Example usage
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double average = findAverage(numbers);
        System.out.println("The average is: " + average);
    }

    public static double findAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}

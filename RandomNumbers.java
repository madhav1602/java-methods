import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        int size = 5;
        
        // Initialise array and call method
        int[] numbers = generateRandomArray(size);
        System.out.println("Generated 4-digit numbers: " + Arrays.toString(numbers));

        // Initialise array and call method
        double[] results = findAverageMinMax(numbers);
        
        // print results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    // Method for array of 4-digit random numbers
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
	}	 
        return arr;
    }

    // Method to find average, min, and max
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0], max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        return new double[]{ sum / numbers.length, min, max };
    }
}

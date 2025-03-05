import java.util.*;

public class CalculateHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        
        // Flling array with random heights 
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }
        
        // Print heights
        System.out.print("Player Heights: ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        
        // Calculate results
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        // Display results
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }

    // Method to calculate sum
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to calculate Mean
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to calculate shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // MEthod to calculate tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

import java.util.Scanner;

class MinMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Call method 
        int[] result = findMinMax(num1, num2, num3);

        // Print the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        
    }

    // Method to find the smallest and largest number
    public static int[] findMinMax(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c)); 
        int max = Math.max(a, Math.max(b, c)); 
        return new int[]{min, max}; // Return both values as an array
    }
}

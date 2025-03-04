import java.util.Scanner;

class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        int n = sc.nextInt();

        // Call method 
        int sum = findSum(n);

        // Print the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        
    }

    // Method to find sum of natural numbers 
    public static int findSum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
        }
        return sum;
    }
}

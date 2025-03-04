import java.util.Scanner;

public class FactorFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        int num = scanner.nextInt();
        

        // Initialise Array and calling method
        int[] factors = getFactors(num);

        // Print Factors
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Calculate required values
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        int sumOfSquares = sumOfSquaresOfFactors(factors);

        // Print Results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }

    // Method to get factors 
    public static int[] getFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to calculate product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    }
}

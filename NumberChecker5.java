import java.util.*;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Calling Methods
        int[] factors = findFactors(number);
        int greatestFactor = findGreatestFactor(factors);
        int sumOfFactors = sumFactors(factors);
        int productOfFactors = productFactors(factors);
        int productOfCubeFactors = productCubeFactors(factors);
        boolean isPerfect = checkPerfect(number, sumOfFactors);
        boolean isAbundant = checkAbundant(number, sumOfFactors);
        boolean isDeficient = checkDeficient(number, sumOfFactors);
        boolean isStrong = checkStrong(number);

        // Printing Results
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
        System.out.println("Product of Cube of Factors: " + productOfCubeFactors);
        System.out.println("Perfect Number: " + isPerfect);
        System.out.println("Abundant Number: " + isAbundant);
        System.out.println("Deficient Number: " + isDeficient);
        System.out.println("Strong Number: " + isStrong);
    }

    // Method to find all factors of a number
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
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

    // Method to find the greatest factor of a number (excluding itself)
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; 
    }

    // Method to find the sum of all factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the product of all factors
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find the product of the cubes of all factors
    public static int productCubeFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean checkPerfect(int num, int sumOfFactors) {
        return sumOfFactors - num == num;
    }

    // Method to check if a number is an abundant number
    public static boolean checkAbundant(int num, int sumOfFactors) {
        return sumOfFactors - num > num;
    }

    // Method to check if a number is a deficient number
    public static boolean checkDeficient(int num, int sumOfFactors) {
        return sumOfFactors - num < num;
    }

    // Method to check if a number is a strong number
    public static boolean checkStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum = sum + factorial(temp % 10);
            temp =temp / 10;
        }
        return sum == num;
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

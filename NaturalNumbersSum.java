import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
   

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Invalid input!");
            return;
        }

        // Calculate sum using recursion
        int sumRecursive = sumUsingRecursion(n);

        // Calculate sum using formula
        int sumFormula = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare and validate
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations match");
        } 
        else {
            System.out.println("Mismatch in results");
        }
    }

    // Recursive method to find sum
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}

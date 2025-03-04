import java.util.Scanner;

class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        // Call method
        int[] result = findRemainderQuotient(numberOfChocolates, numberOfChildren);

        // Print the result
        System.out.println("Each child gets: " + result[1]);
        System.out.println("Remaining chocolates: " + result[0]);

    }

    // Method to calculate chocolates and remaining chocolates
    public static int[] findRemainderQuotient(int chocolates, int children) {
        int remainder = chocolates % children;  
        int quotient = chocolates / children;   
        return new int[]{remainder, quotient};
    }
}

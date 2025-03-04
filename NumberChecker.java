import java.util.Scanner;

class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        int num = sc.nextInt();

        // Call method 
        int result = checkNumber(num);

        // Print the result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        
    }

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }
}

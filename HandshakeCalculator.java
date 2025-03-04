import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number of students
        int n = sc.nextInt();

        // Call the method 
        int maxHandshakes = calculateHandshakes(n);

        // Print the result
        System.out.println("The maximum number of handshakes possible among " + n + " students is: " + maxHandshakes);

    }

    // Method to calculate handshakes
    public static int calculateHandshakes(int n) {
        return  (n*(n-1))/2;
    }
}

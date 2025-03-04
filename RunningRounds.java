import java.util.Scanner;

class RunningRoundsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input 
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // Call the method
        double rounds = calculateRounds(side1, side2, side3);

        // Print the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");

        
    }

    // Method to compute the number of rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
}

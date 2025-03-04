import java.util.Scanner;

class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        double angle = sc.nextDouble();

        // Call method
        double[] results = trigonometricFunctions(angle);

        // Print the results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }

    // Method to calculate trigonometric functions
    public static double[] trigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

      return new double[]{sine,cosine,tangent};
    }
}

import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for a, b, c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        

        // Initialise Array and call method
        double[] roots = findRoots(a, b, c);

        // Print results
        if (roots.length == 0) {
            System.out.println("No real roots ");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
        }
    }

    // Method to find the roots 
    public static double[] findRoots(double a, double b, double c) {
      
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            return new double[0]; 
        } 
        else if (delta == 0) {
            return new double[]{ -b / (2 * a) }; 
        } 
        else {
            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            return new double[]{ root1, root2 }; 
        }
    }
}

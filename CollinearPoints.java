import java.util.*;

public class CollinearPoints {
    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.print("Enter x3, y3: ");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        // Calling Methods
        boolean isCollinearSlope = checkCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearArea = checkCollinearArea(x1, y1, x2, y2, x3, y3);

        // Printing Results
        System.out.println("Collinear using slope method: " + isCollinearSlope);
        System.out.println("Collinear using area method: " + isCollinearArea);
    }

    // Method to check collinearity using slope formula
    public static boolean checkCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of a triangle formula
    public static boolean checkCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}

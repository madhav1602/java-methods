import java.util.*;

public class StudentScoreCalculator {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        
        // Initializing Array and calling methods
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayResults(scores, results);
    }

    // Method to generate random scores
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random() * 50) + 50;
            scores[i][1] = (int) (Math.random() * 50) + 50;
            scores[i][2] = (int) (Math.random() * 50) + 50;
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display results
    public static void displayResults(int[][] scores, double[][] results) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            System.out.print("Physics: " + scores[i][0] + ", Chemistry: " + scores[i][1] + ", Math: " + scores[i][2]);
            System.out.print(", Total: " + results[i][0] + ", Average: " + results[i][1] + ", Percentage: " + results[i][2] + "%");
            System.out.println();
        }
    }
}

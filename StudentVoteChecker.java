import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

	// Taking input and checking	
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = canStudentVote(ages[i]);

	    // Printing result for each student
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
    // Method to check if a student is eligible to vote
    public static boolean canStudentVote(int age) {
        if (age < 18) {
            return false;
        }
      else{
        return true;
      }
        
    }
}

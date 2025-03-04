import java.util.Scanner;

class RemainderQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        

        // Call method 
        int[] result = findRemainderQuotient(num1, num2);

        // Print the result
        System.out.println("Remainder: " + result[0]);
        System.out.println("Quotient: " + result[1]);

        
    }

    // Method to find the remainder and quotient
    public static int[] findRemainderQuotient(int a, int b) {
        int remainder=a%b;
		int quotient=a/b;
		return new int[]{remainder,quotient};
		
    }
}

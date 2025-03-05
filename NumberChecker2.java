import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Calling Methods
        int digitCount = countDigits(number);
        int[] digitsArray = storeDigits(digitCount, number);
        int digitSum = sumDigits(digitsArray);
        int squareSum = sumSquares(digitsArray);
        boolean isHarshadNumber = isHarshad(number, digitSum);
        int[][] frequencyArray = digitFrequency(digitsArray);

        // Printing Results
        System.out.println("Count: " + digitCount);
        System.out.println("Sum: " + digitSum);
        System.out.println("Square Sum: " + squareSum);
        System.out.println("Harshad: " + isHarshadNumber);

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i][1] > 0) {
                System.out.println(frequencyArray[i][0] + " -> " + frequencyArray[i][1]);
            }
        }
    }

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int count, int num) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to calculate the sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Method to calculate the sum of squares of digits
    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i] * digits[i];
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int num, int sum) {
        return num % sum == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }
        return frequency;
    }
}

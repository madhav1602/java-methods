import java.util.*;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Calling Methods
        int digitCount = countDigits(number);
        int[] digitsArray = storeDigits(digitCount, number);
        int[] reversedArray = reverseDigits(digitsArray);
        boolean arraysEqual = compareArrays(digitsArray, reversedArray);
        boolean isPalindrome = checkPalindrome(arraysEqual);
        boolean isDuckNumber = checkDuckNumber(digitsArray);

        // Printing Results
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Palindrome: " + isPalindrome);
        System.out.println("Duck Number: " + isDuckNumber);
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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean checkPalindrome(boolean arraysEqual) {
        return arraysEqual;
    }

    // Method to check if a number is a Duck Number
    public static boolean checkDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}

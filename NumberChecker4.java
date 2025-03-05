import java.util.*;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Calling Methods
        boolean isPrime = checkPrime(number);
        boolean isNeon = checkNeon(number);
        boolean isSpy = checkSpy(number);
        boolean isAutomorphic = checkAutomorphic(number);
        boolean isBuzz = checkBuzz(number);

        // Printing Results
        System.out.println("Prime Number: " + isPrime);
        System.out.println("Neon Number: " + isNeon);
        System.out.println("Spy Number: " + isSpy);
        System.out.println("Automorphic Number: " + isAutomorphic);
        System.out.println("Buzz Number: " + isBuzz);
    }

    // Method to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is neon
    public static boolean checkNeon(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is spy
    public static boolean checkSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean checkAutomorphic(int num) {
    int square = num * num, temp = num;
    while (temp > 0) {
        if (square % 10 != temp % 10) return false;
        square /= 10;
        temp /= 10;
    }
    return true;
}

    // Method to check if a number is buzz number
    public static boolean checkBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}

import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        String[] otpArray = new String[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }
        
	// Printing results
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
        System.out.println("Are all OTPs unique? " + checkUnique(otpArray));
    }

    // Method to generate a 6-digit OTP
    public static String generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return Integer.toString(otp);
    }

    // Method to check if all OTPs are unique
    public static boolean checkUnique(String[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i].equals(otpArray[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}

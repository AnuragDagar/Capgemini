import java.util.HashSet;
import java.util.Set;

public class Question7 {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areUniqueOTPs(int[] otpNumbers) {
        Set<Integer> otpSet = new HashSet<>();

        for (int otp : otpNumbers) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpNumbers = new int[10];

        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpNumbers[i]);
        }

        if (areUniqueOTPs(otpNumbers)) {
            System.out.println("\nAll OTPs are unique!");
        } else {
            System.out.println("\nThere are duplicate OTPs!");
        }
    }
}

import java.util.Arrays;

public class Question4 {

    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();
    }

    public static int[] storeDigits(int number) {
        int length = countDigits(number);
        int[] digits = new int[length];
        number = Math.abs(number);

        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }

        return reversed;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;

       
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        
        int[] digits = storeDigits(number);
        System.out.println("Digits of the number: " + Arrays.toString(digits));

        
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

       
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalindrome);

        
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck number: " + isDuck);
    }
}

import java.util.Arrays;

public class Question3 {

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

    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = sumOfDigits(number);
        return number % sumOfDigits == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; 

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                result[index] = frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 153; 
       
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        
        int[] digits = storeDigits(number);
        System.out.println("Digits of the number: " + Arrays.toString(digits));

        int sumOfDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits);

        double sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of the squares of digits: " + sumOfSquares);

        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad number: " + isHarshad);

        int[][] frequencies = digitFrequency(number);
        System.out.println("Frequency of digits:");
        for (int[] freq : frequencies) {
            System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
        }
    }
}

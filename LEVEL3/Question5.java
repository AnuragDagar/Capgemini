public class Question5 {

   
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;
    }

   
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        
       
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        
       
        return squareStr.endsWith(numStr);
    }

    
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 7;
        
      
        boolean prime = isPrime(number);
        System.out.println(number + " is prime: " + prime);

        
        boolean neon = isNeon(number);
        System.out.println(number + " is neon: " + neon);

        
        boolean spy = isSpy(number);
        System.out.println(number + " is spy: " + spy);

        
        boolean automorphic = isAutomorphic(number);
        System.out.println(number + " is automorphic: " + automorphic);

        
        boolean buzz = isBuzz(number);
        System.out.println(number + " is buzz: " + buzz);
    }
}

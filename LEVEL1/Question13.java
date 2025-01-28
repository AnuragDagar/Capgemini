import java.util.Scanner;

public class Question13 {

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double[] results = new double[3];

        results[0] = Math.sin(radians);  
        results[1] = Math.cos(radians);  
        results[2] = Math.tan(radians);  

        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        Question13 trigFunc = new Question13();

        double[] results = trigFunc.calculateTrigonometricFunctions(angle);

        System.out.println("For an angle of " + angle + "°:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}

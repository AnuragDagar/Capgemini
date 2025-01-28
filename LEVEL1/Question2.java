import java.util.Scanner;

public class Question2 {
    
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are needed for a handshake.");
        } else {
            int maxHandshakes = calculateHandshakes(numberOfStudents);

            System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);
        }

        scanner.close();
    }
}

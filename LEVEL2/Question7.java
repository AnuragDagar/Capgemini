import java.util.Scanner;

public class Question7 {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        
        if (age >= 18) {
            return true;
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] studentAges = new int[10];
        
        Question7 checker = new Question7();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
            
            boolean canVote = checker.canStudentVote(studentAges[i]);
            
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        scanner.close();
    }
}

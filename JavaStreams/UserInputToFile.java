import java.io.*;
public class UserInputToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "user.txt";
        
        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            
            System.out.println("User information saved successfully in " + fileName);
        }
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

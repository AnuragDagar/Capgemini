import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float L = sc.nextFloat();
        float H = sc.nextFloat();
        float Peri = 2 * (L + H);
        System.out.println(Peri);
    }
}

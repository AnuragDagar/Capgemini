import java.util.*;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float P = sc.nextFloat();
        Float R = sc.nextFloat();
        float T = sc.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.println(SI);
    }
}

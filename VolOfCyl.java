import java.util.*;

public class VolOfCyl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float r = sc.nextFloat();
        Float h = sc.nextFloat();
        Float V = 3.14f * r * r * h;
        System.out.println(V);
    }
}

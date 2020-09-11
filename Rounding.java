import java.util.*;
import java.lang.Math;

public class Rounding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String arr = "";
        for (int i = 0; i < n; i++) {
            Long a = in.nextLong();
            Long b = in.nextLong();
            arr += Math.round(a.floatValue() / b.floatValue()) + " ";
        }
        System.out.println(arr);
    }
}
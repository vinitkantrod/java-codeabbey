import java.util.*;
import java.lang.Math;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Integer x = in.nextInt();
            Integer y = in.nextInt();
            Float r = 1f;
            while (y > 0) {
                Float d = x / r;
                r = (r + d) / 2;
                y--;
            }
            String[] rr = String.valueOf(r).split("\\.");
            String ss = rr[1].length() == 1 && rr[1].equals("0") ? String.valueOf(rr[0]) : String.valueOf(r);
            res += ss + " ";
        }
        System.out.println(res);
    }
}
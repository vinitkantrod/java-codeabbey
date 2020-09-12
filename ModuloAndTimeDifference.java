/*
2 10 10 10 3 5 5 5 = 0 54 54 55 + 2 10 10 10
0 19 48 22 5 1 25 16 = 4 6 36 54 + 0 19 48 22 = 5 2 25 16
 */
import java.util.*;

public class ModuloAndTimeDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Integer res_d1 = 0;
            Integer res_h1 = 0;
            Integer res_m1 = 0;
            Integer res_s1 = 0;

            Integer d1 = in.nextInt();
            Integer h1 = in.nextInt();
            Integer m1 = in.nextInt();
            Integer s1 = in.nextInt();

            Integer d2 = in.nextInt();
            Integer h2 = in.nextInt();
            Integer m2 = in.nextInt();
            Integer s2 = in.nextInt();

            Boolean isCarryForwardAllowed = false;
            if ( (s2 - s1) < 0 ) {
                isCarryForwardAllowed = true;
                res_s1 = 60 - Math.abs(s2 - s1);
            } else {
                res_s1 = s2 - s1;
            }
            if ( (m2 - m1) < 0 ) {
                if (isCarryForwardAllowed) {
                    res_m1 = 60 - Math.abs(m2 - m1) - 1;
                } else {
                    res_m1 = 60 - Math.abs(m2 - m1);
                }
                isCarryForwardAllowed = true;
            } else {
                if (isCarryForwardAllowed) {
                    res_m1 = m2 - m1 - 1;
                } else {
                    res_m1 = m2 - m1;
                }
                isCarryForwardAllowed = false;

            }
            if ( (h2 - h1) < 0 ) {
                if (isCarryForwardAllowed) {
                    res_h1 = 24 - Math.abs(h2 - h1) - 1;
                } else {
                    res_h1 = 24 - Math.abs(h2 - h1);
                }
                isCarryForwardAllowed = true;
            } else {
                if (isCarryForwardAllowed) {
                    res_h1 = h2 - h1 - 1;
                } else {
                    res_h1 = h2 - h1;
                }
                isCarryForwardAllowed = false;
            }
            if (isCarryForwardAllowed) {
                res_d1 = d2 - d1 - 1;
            } else {
                res_d1 = d2 - d1;
            }
            res += "(" + res_d1 + " " + res_h1 + " " + res_m1 + " " + res_s1 + ") ";
        }
        System.out.println(res);
    }
}
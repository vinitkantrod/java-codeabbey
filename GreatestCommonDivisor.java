import java.util.*;
import java.math.BigInteger;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n ; i++) {
            res += "(";
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            Long numerator = Long.valueOf(a) * Long.valueOf(b);
            Integer gcd = 0;
            while (!a.equals(b) ) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            res += a + " ";
            Long lcm = numerator / a;
            res += lcm + ") ";
        }
        System.out.println(res);
    }
}
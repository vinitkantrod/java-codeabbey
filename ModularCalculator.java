import java.util.*;
import java.math.BigInteger;

public class ModularCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.nextLine();
        Boolean cont = true;
        while (cont) {
            String[] s = in.nextLine().split(" ");
            if (s.length == 0) {
                cont = false;
            } else {
                BigInteger x = new BigInteger(s[1]);
                if (s[0].equals("+")) {
                    n =n.add(x);
                }
                if (s[0].equals("*")) {
                    n = n.multiply(x);
                }
                if (s[0].equals("%")) {
                    n = n.mod(x);
                    cont = false;
                }
            }
        }
        System.out.println(String.valueOf(n));
    }
}
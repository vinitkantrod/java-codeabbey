import java.util.*;

public class DoubleDiceRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Long a = in.nextLong();
            Integer d1 = (int)( a % 6L ) + 1;
            Long b = in.nextLong();
            Integer d2 = (int)( b % 6L ) + 1;
            res += d1 + d2 + " ";
        }
        System.out.println(res);
    }
}
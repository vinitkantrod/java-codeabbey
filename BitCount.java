import java.util.*;

public class BitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Integer x = in.nextInt();
            String s = Integer.toBinaryString(x);
            Integer r = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    r++;
                }
            }
            res += r + " ";
        }
        System.out.println(res);
    }
}
import java.util.*;

public class RotateString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Integer a = in.nextInt();
            String s = in.next();
            String newS = "";
            if (a >= 0) {
                for (int j = a; j < s.length(); j++ ) {
                    newS += s.charAt(j);
                }
                for (int j = 0; j < a; j++ ) {
                    newS += s.charAt(j);
                }
            } else if (a < 0) {
                for (int k = s.length() + a; k < s.length(); k++) {
                    newS += s.charAt(k);
                }
                for (int j = 0; j < s.length() + a; j++ ) {
                    newS += s.charAt(j);
                }
            }
            res += newS + " ";
        }
        System.out.println(res);
    }
}
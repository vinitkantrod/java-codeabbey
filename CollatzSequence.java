import java.util.*;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Integer x = in.nextInt();
            res += String.valueOf(collatzSequence(x)) + " ";
        }
        System.out.println(res);
    }

    public static Integer collatzSequence(Integer n) {
        Integer r = 0;
        Integer c = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            c++;
        }
        return c;
    }
}
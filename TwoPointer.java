import java.util.*;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Long x = in.nextLong();
            Long y = in.nextLong();
            Long z = in.nextLong();
            Long timer = 0L;
            Long c = 0L;
            while (c < z ) {
                timer++;
                if (timer % x == 0) c++;
                if (timer % y == 0) c++;
            }
            res += timer + " ";
        }
        System.out.println(res);
    }
}
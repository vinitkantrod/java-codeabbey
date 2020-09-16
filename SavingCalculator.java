import java.util.*;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Integer s = in.nextInt();
            Integer r = in.nextInt();
            Integer p = in.nextInt();
            Double sum = Double.valueOf(s);
            Integer y = 0;
            while (sum.intValue() < r) {
                y++;
                sum += Math.floor( ( sum * ( Double.valueOf(p) / 100.0) ) * 100.0 ) / 100.0;
                System.out.println(y + " " + sum);
            }
            res += y + " ";
        }
        System.out.println(res);
    }
}
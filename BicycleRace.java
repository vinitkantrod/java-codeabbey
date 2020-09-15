import java.util.*;

public class BicycleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Integer d = in.nextInt();
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            Float t = (float)d / ( (float)a + (float)b );
            Float f = (float)a * (float)t;
            String[] rr = String.valueOf(f).split("\\.");
            String ss = rr[1].length() == 1 && rr[1].equals("0") ? String.valueOf(rr[0]) : String.valueOf(f);
            res += ss + " ";
        }
        System.out.println(res);
    }
}
import java.util.*;
import java.lang.Math;

public class AverageOfAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String[] st = in.nextLine().split(" ");
            Integer sum = 0;
            for (int j = 0; j < st.length -1 ; j++) {
                sum += Integer.valueOf(st[j]);
            }
            res += Math.round(sum / Float.valueOf(st.length - 1) ) + " ";
        }
        System.out.println(res);
    }
}
import java.util.*;

public class WeightedSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n ; i++) {
            String x = String.valueOf(in.nextInt());
            char[] ch = x.toCharArray();
            Integer sum = 0;
            for (int j = 1; j <= ch.length; j++) {
                sum += Character.getNumericValue(ch[j-1]) * j;
            }
            res += sum + " ";
        }
        System.out.println(res);
    }
}
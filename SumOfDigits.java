import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String arr = "";
        for (int i = 0; i < n ; i++) {
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            Integer c = in.nextInt();
            String res = String.valueOf(a * b + c);
            Integer sum = 0;
            for (char ch : res.toCharArray() ) {
                sum += Character.getNumericValue(ch);
            }
            arr += String.valueOf(sum) + " ";
        }
        System.out.println(arr);
    }
}
import java.util.*;

public class MinimumOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            Long a = in.nextLong();
            Long b = in.nextLong();
            Long c = in.nextLong();
            if (a < b && a < c) arr[i] = a;
            else if (b < a && b < c) arr[i] = b;
            else arr[i] = c;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
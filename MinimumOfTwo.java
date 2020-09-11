import java.util.*;

public class MinimumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            Long a = in.nextLong();
            Long b = in.nextLong();
            if (a < b) arr[i] = a;
            else arr[i] = b;
        }

        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
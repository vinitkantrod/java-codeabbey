import java.util.*;

public class SumInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Integer sum = 0;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);

    }
}
import java.util.*;

public class ArrayCounters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer m = in.nextInt();
        Integer n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < m ; i++) {
            Integer x = in.nextInt();
            arr[x - 1] = arr[x - 1] == null ? 1 : arr[x - 1] + 1;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
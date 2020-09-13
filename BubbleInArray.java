import java.util.*;

public class BubbleInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        Integer[] arr = new Integer[s.length - 1];
        Long res = 0L;
        for (int i = 0; i < s.length -1 ; i++) {
            arr[i] = Integer.valueOf(s[i]);
        }
        Integer swapCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                Integer temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
            res = ( (res + Long.valueOf(arr[i]) ) * 113L ) % 10000007L;
        }
        res = ( (res + Long.valueOf(arr[s.length - 2]) ) * 113L ) % 10000007L;
        System.out.println(String.valueOf(swapCount) + " " + String.valueOf(res));
    }
}
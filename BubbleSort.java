import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        in.nextLine();
        String[] s = in.nextLine().split(" ");
        Integer[] arr = new Integer[n];
        for (int k = 0; k < s.length; k++) {
            arr[k] = Integer.valueOf(s[k]);
        }
        Integer pass = 0;
        Integer swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            Boolean isSorted = true;
            pass++;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println(String.valueOf(pass) + " " + String.valueOf(swap));
    }
}
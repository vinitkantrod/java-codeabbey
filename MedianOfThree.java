import java.util.*;

public class MedianOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String arr = "";
        in.nextLine();
        for (int i = 0; i < n ; i++ ) {
            String[] s = in.nextLine().split(" ");
            Integer[] ints = new Integer[s.length];
            for (int j = 0; j < s.length; j++) {
                ints[j] = Integer.valueOf(s[j]);
            }
            Arrays.sort(ints);
            arr += String.valueOf(ints[1]) + " ";
        }
        System.out.println(arr);
    }
}
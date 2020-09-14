import java.util.*;

public class SortWithIndexes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        in.nextLine();
        String res = "";
        String[] s = in.nextLine().split(" ");
        Integer[] a = new Integer[s.length];
        Integer[] aSorted = new Integer[s.length];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(s[i]);
            aSorted[i] = Integer.valueOf(s[i]);
        }
        Arrays.sort(aSorted);
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
               if (aSorted[j].equals(a[k])) {
                   res += k + 1 + " ";
               }
            }
        }
        System.out.println(res);
    }
}
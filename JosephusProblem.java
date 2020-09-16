import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Integer k = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            arr.add(i);
        }
        Integer index = 0;
        System.out.println(arr);
        while (arr.size() > 1) {
            index = (index + k - 1) % arr.size();
            arr.remove((int)index); // remove consider Integer as an Object and removed value instead of index
        }
        System.out.println(arr);
    }
}
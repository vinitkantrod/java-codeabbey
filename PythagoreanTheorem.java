import java.util.*;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        in.nextLine();
        String res = "";
        for (int i = 0; i < n; i++) {
            String[] s = in.nextLine().split(" ");
            Integer[] arr = new Integer[3];
            for (int j = 0; j < s.length; j++) {
                arr[j] = Integer.valueOf(s[j]);
            }
            Arrays.sort(arr);
            if ( ( ( arr[0] * arr[0] ) + ( arr[1] * arr[1] ) ) == ( arr[2] * arr[2] ) ) res += "R ";
            if ( ( ( arr[0] * arr[0] ) + ( arr[1] * arr[1] ) ) > ( arr[2] * arr[2] ) ) res += "A ";
            if ( ( ( arr[0] * arr[0] ) + ( arr[1] * arr[1] ) ) < ( arr[2] * arr[2] ) ) res += "O ";
        }
        System.out.println(res);
    }
}
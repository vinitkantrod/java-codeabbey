import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res = "";
        for (int i = s.length() - 1 ; i >= 0; i-- ) {
            res += s.charAt(i);
        }
        System.out.println(res);
    }
}
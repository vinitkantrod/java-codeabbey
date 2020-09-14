import java.util.*;

public class Palindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String x = in.nextLine();
            x = x.replaceAll(" ", "").replaceAll("[\\,\\'\\!\\-]", "").toLowerCase();
            Boolean isPalindrome = true;
            for (int j = 0, k = x.length() - 1; j <= k; j++, k--) {
                if (x.charAt(j) != x.charAt(k)) {
                    isPalindrome = false;
                    break;
                }
            }
            res += isPalindrome ? "Y " : "N ";
        }
        System.out.println(res);
    }
}
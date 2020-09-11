import java.util.*;

public class SumsInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        for (int i = 0; i < n; i++) System.out.print(in.nextInt() + in.nextInt() + " ");
    }
}
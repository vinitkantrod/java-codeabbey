import java.util.*;

public class ArithmaticProgression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String arr = "";
        for (int i = 0; i < n; i++) {
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            Integer s = in.nextInt();
            Integer sum = 0;
            for (int j = 0; j < s; j++) {
                sum += (a + ( j * b ) );
            }

            arr += sum + " ";
        }
        System.out.println(arr);
    }
}
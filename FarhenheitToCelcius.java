import java.util.*;

public class FarhenheitToCelcius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String arr = "";
        for (int i = 0;i < n; i++) {
            arr += conver(in.nextInt()) + " ";
        }

        System.out.println(arr);
    }

    private static Integer conver(Integer f) {
        return Math.round( ( (f - 32) * 5 ) / 9f );
    }
}
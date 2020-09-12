import java.util.*;

public class ArrayChecksum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Long res = 0L;
        for (int i = 0; i < n ; i++ ){
            Integer x = in.nextInt();
            res = ( (res + Long.valueOf(x) ) * 113L ) % 10000007L;
        }
        System.out.println(String.valueOf(res));
    }
}
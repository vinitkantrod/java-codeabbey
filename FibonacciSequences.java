import java.util.*;
import java.math.BigInteger;

public class FibonacciSequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        BigInteger[] arr = new BigInteger[1000];
        arr[0] = new BigInteger("0");
        arr[1] = new BigInteger("1");
        for (int i = 2; i < 1000; i++) {
            arr[i] = arr[i-1].add(arr[i-2]);
        }
        for (int i = 0; i < n; i++) {
            BigInteger x = in.nextBigInteger();
            for (int j = 0; j < 1000; j++) {
                if (arr[j].equals(x)) {
                    res += j + " ";
                    break;
                }
            }
        }
        System.out.println(res);
    }
}

import java.util.*;

public class LinearCongruentialNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n ; i++) {
            Integer A = in.nextInt();
            Integer C = in.nextInt();
            Integer M = in.nextInt();
            Integer X0 = in.nextInt();
            Integer N = in.nextInt();
            Integer XNext = 0;
            while (N > 0) {
                X0 = linearNum(A, C, X0, M);
                N--;
            }
            res += X0 + " ";
        }
        System.out.println(res);
    }

    public static Integer linearNum(Integer A, Integer C, Integer X0, Integer M) {
        return ( (A * X0) + C) % M;
    }
}
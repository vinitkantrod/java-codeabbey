import java.util.*;

public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0 ; i < n; i++) {
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            Integer c = in.nextInt();
            Integer[] arr = getSortedArray(a, b, c);
            if (arr[0] + arr[1] >= arr[2]) res += "1 ";
            else res += "0 ";
        }

        System.out.println(res);
    }

    private static Integer[] getSortedArray(Integer a, Integer b, Integer c) {
        Integer[] arr = new Integer[3];
        if (a < b && a < c) {
            arr[0] = a;
            if (b < c) {
                arr[1] = b;
                arr[2] = c;
            } else {
                arr[1] = c;
                arr[2] = b;
            }
        } else if (b < a && b < c) {
            arr[0] = b;
            if (a < c) {
                arr[1] = a;
                arr[2] = c;
            } else {
                arr[1] = c;
                arr[2] = a;
            }
        } else {
            arr[0] = c;
            if (a < b) {
                arr[1] = a;
                arr[2] = b;
            } else {
                arr[1] = b;
                arr[2] = a;
            }
        }
        return arr;
    }
}
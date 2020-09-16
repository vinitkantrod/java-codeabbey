import java.util.*;

public class SmoothingTheWeather {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Double[] fArr = new Double[n];
        Double[] fArrRes = new Double[n];
        for (int i = 0 ; i < n; i++) {
            Double f = in.nextDouble();
            fArr[i] = f;
        }
        fArrRes[0] = fArr[0];
        fArrRes[n - 1] = fArr[n - 1];
        for (int i = 1; i < n - 1; i++) {
            fArrRes[i] = ( fArr[i - 1] + fArr[i] + fArr[i + 1] ) / 3.0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fArrRes[i] + " ");
        }

    }
}
import java.util.*;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            Float w = in.nextFloat();
            Float h = in.nextFloat();
            Float bmi = w / ( h * h);
            if (bmi < 18.5f) {
                res += "under" + " ";
            } else if (bmi >= 18.5f && bmi < 25.0f) {
                res += "normal" + " ";
            } else if (bmi >= 25.0f && bmi < 30.0f) {
                res += "over" + " ";
            } else {
                res += "obese" + " ";
            }
        }

        System.out.println(res);
    }
}
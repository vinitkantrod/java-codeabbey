import java.util.*;
import java.lang.Math;
import java.math.BigDecimal;

public class DiceRolling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        for (int i = 0; i < n ; i++) {
            BigDecimal b = in.nextBigDecimal();
            res += String.valueOf( b.multiply(BigDecimal.valueOf(6)).add( BigDecimal.valueOf(1)).intValue() ) + " ";
        }
        System.out.println(res);
    }
}
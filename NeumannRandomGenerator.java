import java.util.*;

public class NeumannRandomGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        String res = "";
        in.nextLine();
        String[] S = in.nextLine().split(" ");
        for (int i = 0; i < S.length; i++) {
            String aS = S[i];
            HashMap<String, Boolean> numbersMap = new HashMap<String, Boolean>();
            numbersMap.put(aS, true);
            Integer count = 0;
            aS = NeumannGenerator(aS);
            count++;
            while (!numbersMap.containsKey(aS)) {
                numbersMap.put(aS, true);
                aS = NeumannGenerator(aS);
                count++;
            }
            res += count + " ";
        }
        System.out.println(res);
    }
    private static String NeumannGenerator(String nS) {
        Long n = Long.parseLong(nS);
        Long newN = Long.valueOf(n) * Long.valueOf(n);
        String ns = String.valueOf(newN);
        while (ns.length() != 8) {
            ns = "0".concat(ns);
        }
        Long newStart = newN / 100L;
        Long newNum = newStart % 10000;
        String res = String.valueOf(newNum);
        while (res.length() != 4) {
            res = "0".concat(res);
        }
        return res;
    }

    public static void printMap(HashMap<String, Boolean> map) {
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

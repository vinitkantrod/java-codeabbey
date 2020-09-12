import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String res = "";
        for (int i = 0 ; i < Integer.valueOf(n) ;i++) {
            String inp = in.nextLine();
            if (inp == "") {
                continue;
            }
            Integer count = 0;
            for (int j = 0; j < inp.length(); j++) {
                switch (inp.charAt(j)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        count += 1;
                    default: break;
                }
            }
            res += count + " ";
        }
        in.close();
        System.out.println(res);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int rows = Integer.valueOf(br.readLine());
            for (int i = 0; i < rows; i++) {
                System.out.print(br.readLine().toLowerCase().replaceAll("[^aeiouy]","").length() + " ");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
 */
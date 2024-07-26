

package tl_bai1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TL_Bai1 {
    
    public static String revStr(String s) {
        String x = "";
        for (char c : s.toCharArray()) {
            x = c + x;
        }
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int cnt = 0;
            BigInteger mod = new BigInteger("13");
            BigInteger bi1 = new BigInteger(s);
            while (cnt++ < 1000 && !bi1.mod(mod).toString().equals("0")) {
                BigInteger bi2 = new BigInteger(revStr(bi1.toString()));
                bi1 = bi1.add(bi2);
            }
            if (bi1.mod(mod).toString().equals("0")) {
                System.out.println(bi1.toString());
            } else {
                System.out.println("-1");
            }
            
        }
    }

}

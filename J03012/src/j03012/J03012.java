

package j03012;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            BigInteger b3 = b1.add(b2);
            System.out.println(b3.toString());
        }
    }

}

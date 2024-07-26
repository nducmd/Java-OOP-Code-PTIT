

package j03016;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger b1 = new BigInteger(sc.next());
            BigInteger b2 = new BigInteger("11");
            BigInteger b3 = b1.mod(b2);
            if (b3.toString().equals("0")) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

}

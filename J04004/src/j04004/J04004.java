

package j04004;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04004 {
    public static long gcd(long a, long b) {
        long r = 0;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
        a.plus(b);
    }

}

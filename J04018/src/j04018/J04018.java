

package j04018;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ComplexNum a = new ComplexNum(sc.nextInt(), sc.nextInt());
            ComplexNum b = new ComplexNum(sc.nextInt(), sc.nextInt());
            ComplexNum c = a.plus(b);
            c = c.mul(a);
            ComplexNum d = a.plus(b);
            d = d.mul(d);
            System.out.println(c + ", " + d);
        }
    }

}

package j04014;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J04014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction c = a.plus(b);
            c = c.mul(c);
            Fraction d = a.mul(b);
            d = d.mul(c);
            System.out.println(c + " " + d);
        }

    }

}

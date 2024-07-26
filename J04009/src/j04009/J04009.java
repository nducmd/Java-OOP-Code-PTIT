

package j04009;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p1.distance(p3);
            if (2 * Math.max(a, Math.max(b, c)) >= a + b +c) {
                System.out.println("INVALID");
            } else {
                double d = Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c)) / 4;
                System.out.println(String.format("%.2f", d));
            }
        }
    }

}



package j04001;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            p1.setD(p1.distance(p2));
            System.out.println(p1);
        }
    }

}

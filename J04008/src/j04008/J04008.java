

package j04008;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle A = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println(A);
        }
    }

}



package j02009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(new Customer(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        int res = 0;
        for (Customer c : a) {
            res = Math.max(res, c.getT()) + c.getD();
        }
        System.out.println(res);
    }

}



package j05009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> a = new ArrayList<>();
        double m = 0;
        while (t-- > 0) {
            ThiSinh e = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            a.add(e);
            m = Math.max(m, e.getD());
            //System.out.println(e);
        }
        Collections.sort(a);
        for (ThiSinh ts : a) {
            if (ts.getD() == m) {
                System.out.println(ts);
            }
            
        }
    }

}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
*/


package j07071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07071 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Name> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Name(sc.nextLine()));
        }
        Collections.sort(a);
        t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            for (Name n : a) {
                if (n.cmp(s)) {
                    System.out.println(n);
                }
            }
        }
    }

}

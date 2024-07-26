

package th1_bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH1_bai2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while (t -- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            Collections.sort(a);
            //System.out.println(a);
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    s1 = s1 + Integer.toString(a.get(i));
                } else {
                    s2 = s2 + Integer.toString(a.get(i));
                }
            }
            System.out.println(Long.parseLong(s1) + Long.parseLong(s2));
        }
    }

}

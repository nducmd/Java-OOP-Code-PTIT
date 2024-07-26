

package th3_bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH3_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (tmp % 2 == 0) {
                    a.add(tmp);
                } else {
                    b.add(tmp);
                }
            }
            Collections.sort(a);
            Collections.sort(b);
            int[] f = new int[1002];
            for (Integer i : a) {
                if (f[i] == 0) {
                    System.out.print(i + " ");
                    f[i] = 1;
                }
                
            }
            System.out.println("");
            for (int i = b.size()-1; i >= 0; i--) {
                if (f[b.get(i)] == 0) {
                    System.out.print(b.get(i) + " ");
                    f[b.get(i)] = 1;
                }
            }
            System.out.println("");
        }
    }

}

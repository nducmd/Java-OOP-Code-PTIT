

package j02028;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            int flag = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] == 0) {
                    flag = 1;
                }
            }
            long curr = 0;
            int f = 0;
            int i = 0;
            String res = "NO";
            while (i < n) {
                while (i < n && curr < k) {
                    curr += a[i];
                    i++;
                }
                while (f <= i && curr > k) {
                    curr -= a[f];
                    f++;
                }
                if (curr == k) {
                    res = "YES";
                    break;
                }
            }
            if (k == 0 && flag == 0) {
                res = "NO";
            }
            System.out.println(res);
        }
    }

}

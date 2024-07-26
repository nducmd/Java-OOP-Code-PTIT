

package j08012;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b;
        int[] f = new int[n+1];
        int m = n- 1;
        while (m-- > 0) {
            f[sc.nextInt()]++;
            f[sc.nextInt()]++;
        }
        String res = "No";
        for (int i = 1; i <= n; i++) {
            if (f[i] == n-1) {
                res = "Yes";
                break;
            }
        }
        System.out.println(res);
    }

}

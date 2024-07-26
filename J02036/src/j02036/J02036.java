

package j02036;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J02036 {
    public static int lcm(int a, int b) {
        int q = a, p = b;
        while (p != 0) {
            int r = q % p;
            q = p;
            p = r;
        }
        return a * b / q;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n+1];
            b[0] = a[0];
            b[n] = a[n-1];
            for (int i = 1; i < n; i++) {
                b[i] = lcm(a[i-1], a[i]);
            }
            for (int i = 0; i < n+1; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println("");
        }
    }

}

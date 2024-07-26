package j02016;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02016 {

    public static int binarySearch(long a[], long k, int start) {
        int l = start;
        int r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] * a[m] == k) {
                return m;
            }
            if (a[m] * a[m] < k) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                a[i] = a[i] * a[i];
            }
            Arrays.sort(a, 0, n);
            String res = "NO";
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (Arrays.binarySearch(a, j+1, n, a[i] + a[j]) >= 0) {
                        res = "YES";
                        break;
                    }
                }
                if (res.equals("YES")) {
                    break;
                }
            }
            
            System.out.println(res);
        }
    }

}

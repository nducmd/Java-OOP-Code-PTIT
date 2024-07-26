package j02027;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02027 {
    public static int lower_bound(int a[], int k, int start) {
        int low = start;
        int high = a.length-1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (k <= a[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (low < a.length && a[low] < k) {
            low++;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                int vt = lower_bound(a, a[i] + k, i+1);
                vt--;
                if (a[vt] - a[i] < k) {
                    cnt += vt - i;
                }
            }
            System.out.println(cnt);
        }
    }

}

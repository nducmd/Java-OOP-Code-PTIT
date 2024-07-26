package j08015;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J08015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            Map<Long, Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (m.containsKey(a[i])) {
                    m.put(a[i], m.get(a[i]) + 1);
                } else {
                    m.put(a[i], 1);
                }
            }
            long res = 0L;
            for (int i = 0; i < n; i++) {
                if (m.containsKey(k - a[i])) {
                    res += m.get(k-a[i]);
                    if (k - a[i] == a[i]) {
                        res -= 1;
                    }
                }
            }
            System.out.println(res/2);
        }
    }

}

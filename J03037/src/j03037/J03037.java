

package j03037;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] d = new int[26];
        int[] c = new int[26];
        for (int i = 0; i < 26; i++) {
            d[i] = -1;
            c[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'A';
            if (d[tmp] == -1) {
                d[tmp] = i;
            } else {
                c[tmp] = i;
            }
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (d[i] < d[j] && d[j] < c[i] && c[i] < c[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}

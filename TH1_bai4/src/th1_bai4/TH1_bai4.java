

package th1_bai4;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH1_bai4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            int[][] f = new int[102][102];
            String b = a;
            int res = 0;
            for (int i = 1; i < a.length(); i++) {
                for (int j = 1; j <= b.length(); j++) {
                    if (a.charAt(i-1) == b.charAt(j-1) && i != j) {
                        f[i][j] = f[i-1][j-1] + 1;
                    } else {
                        f[i][j] = Math.max(f[i][j-1], f[i-1][j]);
                    }
                    res = Math.max(res, f[i][j]);
                }
            }
            System.out.println(res);
        }
    }

}

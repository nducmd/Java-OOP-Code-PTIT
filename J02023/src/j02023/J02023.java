package j02023;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = sc.nextInt();
        if (S == 0 || 9*n < S) {
            System.out.println("-1 -1");
        } else {
            int i = n;
            int s = S - 1;
            String res = "";
            while (i > 1 && s >= 0) {
                int tmp = 0;
                if (s >= 9) {
                    tmp = 9;
                } else {
                    tmp = s;
                }
                s -= tmp;
                res = Integer.toString(tmp) + res;
                i--;
            }
            res = Integer.toString(1+s) + res;
            System.out.print(res + " ");
            res = "";
            i = 1;
            s = S;
            while (i <= n && s >= 0) {
                int tmp = 0;
                if (s >= 9) {
                    tmp = 9;
                } else {
                    tmp = s;
                }
                s -= tmp;
                res = res + Integer.toString(tmp);
                i++;
            }
            System.out.println(res);
        }
    }

}
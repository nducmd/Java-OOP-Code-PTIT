

package j08024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J08024 {
    public static void solve(int n) {
        Queue<Long> qu = new LinkedList<>();
        
        long res = 9;
        qu.add(res);
        while (res % n != 0) {
            res = qu.poll();
            qu.add(res * 10);
            qu.add(res * 10 + 9);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            solve(n);
        }
    }

}

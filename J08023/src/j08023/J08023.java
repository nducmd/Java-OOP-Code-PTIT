

package j08023;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */

public class J08023 {
    public static long solve(int[] a) {
        long res = 0;
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] next = new int[n];
        int[] prev = new int[n];
        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            st.pop();
        }
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res, (long)(next[i] - prev[i] - 1) * a[i]);
        }
        return res;
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
            System.out.println(solve(a));
        }
    }

}

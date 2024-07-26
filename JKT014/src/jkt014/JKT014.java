

package jkt014;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */

public class JKT014 {
    public static void solve(int a[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            while (st.size() > 1 && a[st.peek()] <= a[i]) {
                st.pop();
            }
            System.out.print((i - st.peek()) + " ");
            st.push(i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            solve(a, n);
        }
    }

}

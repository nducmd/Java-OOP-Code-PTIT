

package j08022;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */

public class J08022 {
    public static void solve(int a[], int n) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && a[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()){
                res.add(-1);
            } else {
                res.add(st.peek());
            }
            st.push(a[i]);
        }
        
        for (int i = res.size()-1 ; i >= 0; i--) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println("");
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
            solve(a, n);
        }
    }

}

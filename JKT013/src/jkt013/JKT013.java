

package jkt013;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */

public class JKT013 {
    public static void solve(int n) {
        Queue<String> qu = new LinkedList<>();
        Stack<String> res = new Stack<>();
        qu.add("6");
        qu.add("8");
        while (qu.peek().length() <= n) {
            String curr = qu.poll();
            res.push(curr);
            qu.add(curr + "6");
            qu.add(curr + "8");
        }
        System.out.println(res.size());
        while (!res.isEmpty()) {
            System.out.print(res.pop() + " ");
        }
        System.out.println("");
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

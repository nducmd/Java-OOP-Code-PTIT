

package j08021;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */

public class J08021 {
    public static int check(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        st.push(-1);
        for (int i = 0 ; i < s.length(); i++) {
            Character x = s.charAt(i);
            if (x == '(' ) {
                st.push(i);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    res = Math.max(res, i-st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            System.out.println(check(s));
        }
    }

}

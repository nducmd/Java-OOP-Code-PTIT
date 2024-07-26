

package j08020;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */

public class J08020 {
    public static String check(String s) {
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(' || x == '{' || x == '[') {
                st.push(x);
            } else {
                if (st.isEmpty()) {
                    return "NO";
                } else {
                    if (x == ')' && st.peek() == '(' || 
                            x == '}' && st.peek() == '{' ||
                            x == ']' && st.peek() == '[') {
                        st.pop();
                    } else {
                        return "NO";
                    }
                }
            }
        }
        if (st.isEmpty()) {
            return "YES";
        }
        return "NO";
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



package th3_bai5;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */

public class TH3_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String[] path = s.split("\\s+");
            Stack<Long> st = new Stack<>();
            for (int i = n-1; i >= 0; i--) {
                try {
                    long curr = Long.parseLong(path[i]);
                    st.push(curr);
                } catch (NumberFormatException ex) {
                    long num1 = st.pop();
                    long num2 = st.pop();
                    long tmp = 0;
                    if (path[i].equals("+")) {
                        tmp = num1 + num2;
                    } else if (path[i].equals("-")) {
                        tmp = num1 - num2;
                    } else if (path[i].equals("*")) {
                        tmp = num1 * num2;
                    } else if (path[i].equals("/")) {
                        tmp = num1 / num2;
                    }
                    st.push(tmp);
                }
            }
            System.out.println(st.pop());
        }
    }

}

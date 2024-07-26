package j03023;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */
public class J03023 {

    public static int getVal(Character c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            default:
                break;
        }
        return 1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int res = 0;
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {

                res += getVal(s.charAt(i));
                if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                    while (!st.isEmpty() && st.peek() == 'I') {
                        res -= 2;
                        st.pop();
                    }
                } else if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
                    while (!st.isEmpty() && st.peek() == 'X') {
                        res -= 20;
                        st.pop();
                    }
                } else if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                    while (!st.isEmpty() && st.peek() == 'C') {
                        res -= 200;
                        st.pop();
                    }
                }
                st.push(s.charAt(i));
            }
            System.out.println(res);
        }
    }

}
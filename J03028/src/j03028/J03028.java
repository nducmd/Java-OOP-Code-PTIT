package j03028;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03028 {
    public static Character rotate(Character c, int d) {
        d = d % 26;
        for (int i = 0; i < d; i++) {
            //System.out.print(i + " ");
            //System.out.println(Character.toChars(c));
            c++;
            if (c > 'Z') {
                c = 'A';
            }
        }
        return c;
    }
    public static String encode(String s) {
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);
        //System.out.println(s1 + " " + s2);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum1 += s1.charAt(i) - 'A';
        }
        for (int i = 0; i < s2.length(); i++) {
            sum2 += s2.charAt(i) - 'A';
        }
        String x1 = "";
        String x2 = "";
        for (int i = 0; i < s1.length(); i++) {
            x1 += rotate(s1.charAt(i), sum1);
        }
        for (int i = 0; i < s2.length(); i++) {
            x2 += rotate(s2.charAt(i), sum2);
        }
        //System.out.println(x1 + " " + x2);
        //System.out.println(sum1 + " " + sum2);
        String res = "";
        for (int i = 0; i < x1.length(); i++) {
            res += rotate(x1.charAt(i), x2.charAt(i) - 'A');
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(encode(s));
        }
    }

}

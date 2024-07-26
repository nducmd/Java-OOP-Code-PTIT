

package j03019;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        Character c = 'a';
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                res = c.toString() + res;
            } else if (s.charAt(i) > c) {
                res = s.charAt(i) + res;
                c = s.charAt(i);
            }
        }
        System.out.println(res);
    }

}

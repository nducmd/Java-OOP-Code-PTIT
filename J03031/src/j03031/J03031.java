

package j03031;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nducmd
 */

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            Set<Character> ms = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                ms.add(s.charAt(i));
            }
            if (ms.size() + k >= 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}



package th2_bai11;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class TH2_bai11 {
    public static String reverse(String s) {
        String x = "";
        for (char c : s.toCharArray()) {
            x = c + x;
        }
        return x;
    }
    public static boolean check(String s) {
        if (s.length() == 0 || s.length() % 2 == 1) {
            return false;
        }
        String x = reverse(s);
        return x.equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> qu = new LinkedList<>();
            Set<String> a = new LinkedHashSet<>();
            //ArrayList<String> a = new ArrayList<>();
            qu.add("");
            while (!qu.isEmpty()) {
                String curr = qu.poll();
                if (curr.length() > n/2) {
                    break;
                }
                //System.out.println(curr);
                qu.add(curr + "0");
                qu.add(curr + "1");
                a.add(curr);
                a.add(curr + reverse(curr));
            }
            for (String x : a) {
                if (check(x))
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }

}

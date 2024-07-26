package j08011;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nducmd
 */
public class J08011 {

    public static class Num implements Comparable<Num> {

        private String k;
        private int v;

        public Num(String k, int v) {
            this.k = k;
            this.v = v;
        }

        @Override
        public String toString() {
            return k + " " + v;
        }

        @Override
        public int compareTo(Num o) {
            return -this.v + o.v;
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    public static boolean check(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> ms = new LinkedHashSet<>();
        ArrayList<Num> a = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            //if (s.equals("-1")) break;
            if (check(s)) {
                ms.add(s);
                if (m.containsKey(s)) {
                    m.put(s, m.get(s) + 1);
                } else {
                    m.put(s, 1);
                }
            }
        }
        for (String x : ms) {
            a.add(new Num(x, m.get(x)));
        }
        Collections.sort(a);
        for (Num num : a) {
            System.out.println(num);
        }
    }

}
/*
123 321 23456 123 123 23456 3523 123 321 4567 8988 78 7654 9899 3456 123 678 999 78 3456 987654321 4546 63543 4656 13432 4563 123471 659837 454945 34355 9087 9977 98534 3456 23134
*/

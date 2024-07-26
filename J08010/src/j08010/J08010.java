

package j08010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nducmd
 */

public class J08010 {
    public static boolean check(String s) {
        String x = "";
        for (char c : s.toCharArray()) {
            x = c + x; 
        }
        return s.equals(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new HashMap<>();
        int res = 0;
        Set<String> a = new LinkedHashSet<>();
        while (sc.hasNext()) {
            String s = sc.next();
            //if (s.equals("-1")) break;
            if (check(s)) {
                if (m.containsKey(s)) {
                    m.put(s, m.get(s)+1);
                } else {
                    m.put(s, 1);
                }
                if (s.length() == res) {
                    a.add(s);
                }
                if (s.length() > res) {
                    res = s.length();
                    a.clear();
                    a.add(s);
                }
            }
        }
        for (String x : a) {
            System.out.println(x + " " + m.get(x));
        }
    }

}
/*
AAA BAABA HDHDH ACBSD SRGTDH DDDDS
DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD
*/
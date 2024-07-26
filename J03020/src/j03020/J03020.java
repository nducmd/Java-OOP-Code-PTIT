

package j03020;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J03020 {
    public static boolean isSymmetric(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return (s.equals(sb.toString()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new LinkedHashMap<>();
        String res = "";
        while (sc.hasNext()) {
            String s = sc.next();
            if (isSymmetric(s)) {
                if (m.containsKey(s)) {
                    m.put(s,m.get(s) + 1);
                } else  {
                    m.put(s,1);
                }
                if (s.length() > res.length()) {
                    res = s;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getKey().length() == res.length()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            
        }
    }

}

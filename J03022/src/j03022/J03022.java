

package j03022;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        String tmp = "";
        while (sc.hasNext()) {
            String s = sc.next();
           // if (s.equals("-1")) break;
            if (s.endsWith(".") || s.endsWith("?") || s.endsWith("!")) {
                tmp += s.substring(0, s.length() - 1);
                a.add(tmp.trim().toLowerCase());
                tmp = "";
            } else {
                tmp += s + " ";
            }
        }
        for (String x : a) {
            x = x.substring(0,1).toUpperCase() + x.substring(1);
            System.out.println(x);
        }
    }

}

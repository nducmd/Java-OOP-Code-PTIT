

package th2_bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class TH2_bai4 {
    public static boolean containsNumber(String word) {
        if (word.contains(".")) return false;
        if (word.contains(",")) return false;
        if (word.contains("!")) return false;
        if (word.contains("?")) return false;
        if (word.contains(":")) return false;
        for (char c = '0'; c <='9'; c++) {
            String x = Character.toString(c);
            if (word.contains(x)) {
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
       
        Set<String> a = new TreeSet<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (containsNumber(s)) {
                a.add(s);
            }
        }
        
        for (String x : a) {
            System.out.println(x);
        }
    }

}

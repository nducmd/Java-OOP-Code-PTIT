

package j07014;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class J07014 {
    public static class WordSet {
        private String file;
        private Set<String> s = new TreeSet<>();
        public WordSet(String file) throws IOException  {
            this.file = file;
            Scanner sc = new Scanner(new File(file));
            while (sc.hasNext()) {
                s.add(sc.next().toLowerCase());
            }
        }
        public String union(WordSet w2) {
            String data = "";
            Set<String> tmp = new TreeSet<>();
            tmp.addAll(s);
            tmp.addAll(w2.s);
            for (String x : tmp) {
                data += x + " ";
            }
            return data.trim();
        }
        public String intersection(WordSet w2) {
            String data = "";
            for (String x : s) {
                if (w2.s.contains(x))
                {
                    data += x + " ";
                }
            }
            return data.trim();
        }
    }
    public static void main(String[] args) throws IOException  {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }

}

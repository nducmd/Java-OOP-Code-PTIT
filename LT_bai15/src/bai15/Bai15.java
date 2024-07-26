package bai15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */
public class Bai15 {

    public static class WordSet {

        private String str;

        public WordSet(String str) {
            this.str = str.toLowerCase();
        }

        public String union(WordSet w2) {
            Set<String> data = new TreeSet<>();
            String[] path1 = this.str.split("\\s+");
            for (int i = 0; i < path1.length; i++) {
                data.add(path1[i]);
            }
            String[] path2 = w2.str.split("\\s+");
            for (int i = 0; i < path2.length; i++) {
                data.add(path2[i]);
            }
            String res = "";
            for (String s : data) {
                res += s + " ";
            }
            return res.trim();
        }

        public String intersection(WordSet w2) {
            Set<String> s1 = new TreeSet<>();
            Set<String> s2 = new TreeSet<>();
            String[] path1 = this.str.split("\\s+");
            for (int i = 0; i < path1.length; i++) {
                s1.add(path1[i]);
            }
            String[] path2 = w2.str.split("\\s+");
            for (int i = 0; i < path2.length; i++) {
                if (s1.contains(path2[i])) {
                    s2.add(path2[i]);
                }
            }
            String res = "";
            for (String s : s2) {
                res += s + " ";
            }
            return res.trim();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }

}

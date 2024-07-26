

package j07007;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

class WordSet {
    private Set<String> data = new TreeSet<>();
    public WordSet(String s) throws IOException {
        Scanner sc = new Scanner(new File(s));
        while (sc.hasNext()) {
            data.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString() {
        for (String s : data) {
            System.out.println(s);
        }
        return "";
    }
}

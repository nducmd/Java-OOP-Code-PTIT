

package th1_bai13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class TH1_bai13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Set<String> set1 =  new TreeSet<>();
        ArrayList<Subject> a = new ArrayList<>();
        int t = 2;
        while (sc.hasNext()) {
            Subject s = new Subject(sc.nextLine(),sc.nextLine(), sc.nextLine());
            if (!set1.contains(s.getId())) {
                a.add(s);
            }
        }
        Collections.sort(a);
        for (Subject s : a) {
            System.out.println(s);
        }
    }

}

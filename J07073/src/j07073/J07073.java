

package j07073;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07073 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Subject> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (Subject s : a) {
            if (!s.getPractice().equals("Truc tiep")) {
                System.out.println(s);
            }
        }
    }

}



package j07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        ArrayList<Subject> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            Subject s = new Subject(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(s);
        }
        Collections.sort(a);
        for(Subject s : a) {
            System.out.println(s);
        }
    }

}

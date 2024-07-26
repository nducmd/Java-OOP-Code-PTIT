

package j07059;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07059 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Subject> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Subject(sc.nextLine(),sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}



package j07084;

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

public class J07084 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (Student s : a) {
            System.out.println(s);
        }
    }

}
